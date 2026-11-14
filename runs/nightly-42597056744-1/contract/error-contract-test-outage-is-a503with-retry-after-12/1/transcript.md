# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-4f0910b1-879c-405f-973b-a777b2b0b091` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-0116d221-23c9-4ecd-914f-f88cff75332e` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-f29aa0fe-9b9c-4640-b7b0-63c3e093d2e2` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-547229df-076d-4267-a30a-5df1a231b3b1` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 7 | `qa-d64535d9-3131-44f7-9554-76c8c945fa0b` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-2612e67f-5189-41cf-a913-5275f5fbc1cb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-7ca7c509-6de6-4877-9077-a4692788cb54` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-6df0a002-3f95-4b09-aa44-7522aeaa8e54` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-1f35057e-3309-4c01-a290-732f1b1eff97` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-39c334cc-4421-408a-ba24-a71650834e73` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4f0910b1-879c-405f-973b-a777b2b0b091

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f0910b1-879c-405f-973b-a777b2b0b091
Content-Type: application/json

--- request body ---
{"handle":"qa-77adf019006f","displayName":"QA 77adf019006f","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f0910b1-879c-405f-973b-a777b2b0b091
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 8
Location: /v1/accounts/qa-77adf019006f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d03c5a83-fd60-4188-8a74-436e9a7d66a2","handle":"qa-77adf019006f","displayName":"QA 77adf019006f","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.580656577Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0116d221-23c9-4ecd-914f-f88cff75332e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0116d221-23c9-4ecd-914f-f88cff75332e
Content-Type: application/json

--- request body ---
{"handle":"qa-38aadf542a5d","displayName":"QA 38aadf542a5d","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0116d221-23c9-4ecd-914f-f88cff75332e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 8
Location: /v1/accounts/qa-38aadf542a5d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cff7fa1d-b8de-4771-9283-37874d5b51c7","handle":"qa-38aadf542a5d","displayName":"QA 38aadf542a5d","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.614003719Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f29aa0fe-9b9c-4640-b7b0-63c3e093d2e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f29aa0fe-9b9c-4640-b7b0-63c3e093d2e2
Content-Type: application/json

--- request body ---
{"handle":"qa-77adf019006f","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f29aa0fe-9b9c-4640-b7b0-63c3e093d2e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d03c5a83-fd60-4188-8a74-436e9a7d66a2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-547229df-076d-4267-a30a-5df1a231b3b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-547229df-076d-4267-a30a-5df1a231b3b1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-38aadf542a5d","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-547229df-076d-4267-a30a-5df1a231b3b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_0df047f0-bdae-410a-b94f-eb122527d0c9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0df047f0-bdae-410a-b94f-eb122527d0c9","subject":"Error contract","status":"open","region":"eu","participants":["qa-77adf019006f","qa-38aadf542a5d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.683526997Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_0df047f0-bdae-410a-b94f-eb122527d0c9/close
correlation: qa-d64535d9-3131-44f7-9554-76c8c945fa0b

--- request headers ---
Accept: application/json
X-Fault-Key: 89958cd9-bc29-4cf7-b494-8c63fceb1853
X-Fault: unavailable-once
X-Correlation-Id: qa-d64535d9-3131-44f7-9554-76c8c945fa0b
Content-Type: application/json

--- response: 503 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d64535d9-3131-44f7-9554-76c8c945fa0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_0df047f0-bdae-410a-b94f-eb122527d0c9/close","correlationId":"qa-d64535d9-3131-44f7-9554-76c8c945fa0b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2612e67f-5189-41cf-a913-5275f5fbc1cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2612e67f-5189-41cf-a913-5275f5fbc1cb
Content-Type: application/json

--- request body ---
{"handle":"qa-38aadf542a5d","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2612e67f-5189-41cf-a913-5275f5fbc1cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cff7fa1d-b8de-4771-9283-37874d5b51c7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ca7c509-6de6-4877-9077-a4692788cb54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ca7c509-6de6-4877-9077-a4692788cb54
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ca7c509-6de6-4877-9077-a4692788cb54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-6df0a002-3f95-4b09-aa44-7522aeaa8e54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6df0a002-3f95-4b09-aa44-7522aeaa8e54
Content-Type: application/json

--- request body ---
{"handle":"qa-38aadf542a5d","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6df0a002-3f95-4b09-aa44-7522aeaa8e54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6df0a002-3f95-4b09-aa44-7522aeaa8e54"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1f35057e-3309-4c01-a290-732f1b1eff97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f35057e-3309-4c01-a290-732f1b1eff97
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1f35057e-3309-4c01-a290-732f1b1eff97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-39c334cc-4421-408a-ba24-a71650834e73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39c334cc-4421-408a-ba24-a71650834e73
Content-Type: application/json

--- request body ---
{"handle":"qa-77adf019006f","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39c334cc-4421-408a-ba24-a71650834e73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-39c334cc-4421-408a-ba24-a71650834e73"}
```
