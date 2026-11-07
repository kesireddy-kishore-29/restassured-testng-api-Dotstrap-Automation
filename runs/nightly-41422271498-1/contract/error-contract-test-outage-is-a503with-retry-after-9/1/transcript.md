# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-eb00dea2-d9b2-49cc-af56-0ae50b456aff` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-8b11f64e-3697-4d27-8156-7a62e53fde71` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-6dd2f945-84fd-40f8-950e-c1d7ee2f5b2f` |
| 4 | `POST /v1/conversations` | 201 | 37 | `qa-eec90faf-45b5-4551-b24b-6019f72f3447` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 15 | `qa-1a7db5c1-4389-4ea9-b3d7-e7b66335edf8` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-4a16f103-4e07-4cee-b7d9-8a8c47555a76` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-c758d9e8-0a95-4b92-9cb6-6ae81ced907e` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-580d47f5-0910-4b7a-9c18-8949a46c620e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-192d10d7-72d4-4a25-9077-725e01f2695c` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-d0a276e3-b93d-4999-8f53-354b35943cc4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eb00dea2-d9b2-49cc-af56-0ae50b456aff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb00dea2-d9b2-49cc-af56-0ae50b456aff
Content-Type: application/json

--- request body ---
{"handle":"qa-df99fb953742","displayName":"QA df99fb953742","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb00dea2-d9b2-49cc-af56-0ae50b456aff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Location: /v1/accounts/qa-df99fb953742
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c31d5fed-aa2a-4259-8555-1379f6b93256","handle":"qa-df99fb953742","displayName":"QA df99fb953742","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.790722444Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8b11f64e-3697-4d27-8156-7a62e53fde71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b11f64e-3697-4d27-8156-7a62e53fde71
Content-Type: application/json

--- request body ---
{"handle":"qa-ed6b7ba4dd5f","displayName":"QA ed6b7ba4dd5f","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b11f64e-3697-4d27-8156-7a62e53fde71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Location: /v1/accounts/qa-ed6b7ba4dd5f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5c9d20fc-71ca-4bcc-bc13-5035ef2f237b","handle":"qa-ed6b7ba4dd5f","displayName":"QA ed6b7ba4dd5f","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.823218609Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6dd2f945-84fd-40f8-950e-c1d7ee2f5b2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dd2f945-84fd-40f8-950e-c1d7ee2f5b2f
Content-Type: application/json

--- request body ---
{"handle":"qa-df99fb953742","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dd2f945-84fd-40f8-950e-c1d7ee2f5b2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c31d5fed-aa2a-4259-8555-1379f6b93256"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-eec90faf-45b5-4551-b24b-6019f72f3447

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eec90faf-45b5-4551-b24b-6019f72f3447
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ed6b7ba4dd5f","subject":"Error contract","message":"Hi"}

--- response: 201 in 37 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-eec90faf-45b5-4551-b24b-6019f72f3447
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
Location: /v1/conversations/cnv_d5efaff1-626a-45a3-b0a3-229d3cb3f9f4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d5efaff1-626a-45a3-b0a3-229d3cb3f9f4","subject":"Error contract","status":"open","region":"eu","participants":["qa-df99fb953742","qa-ed6b7ba4dd5f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.915902816Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_d5efaff1-626a-45a3-b0a3-229d3cb3f9f4/messages
correlation: qa-1a7db5c1-4389-4ea9-b3d7-e7b66335edf8

--- request headers ---
Accept: application/json
X-Fault-Key: b8023b6d-4560-471a-b041-ce1f0a1ba375
X-Fault: unavailable-once
X-Correlation-Id: qa-1a7db5c1-4389-4ea9-b3d7-e7b66335edf8
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a7db5c1-4389-4ea9-b3d7-e7b66335edf8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_d5efaff1-626a-45a3-b0a3-229d3cb3f9f4/messages","correlationId":"qa-1a7db5c1-4389-4ea9-b3d7-e7b66335edf8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4a16f103-4e07-4cee-b7d9-8a8c47555a76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a16f103-4e07-4cee-b7d9-8a8c47555a76
Content-Type: application/json

--- request body ---
{"handle":"qa-ed6b7ba4dd5f","password":"****"}

--- response: 200 in 34 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a16f103-4e07-4cee-b7d9-8a8c47555a76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5c9d20fc-71ca-4bcc-bc13-5035ef2f237b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c758d9e8-0a95-4b92-9cb6-6ae81ced907e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c758d9e8-0a95-4b92-9cb6-6ae81ced907e
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c758d9e8-0a95-4b92-9cb6-6ae81ced907e
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
correlation: qa-580d47f5-0910-4b7a-9c18-8949a46c620e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-580d47f5-0910-4b7a-9c18-8949a46c620e
Content-Type: application/json

--- request body ---
{"handle":"qa-ed6b7ba4dd5f","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-580d47f5-0910-4b7a-9c18-8949a46c620e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-580d47f5-0910-4b7a-9c18-8949a46c620e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-192d10d7-72d4-4a25-9077-725e01f2695c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-192d10d7-72d4-4a25-9077-725e01f2695c
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-192d10d7-72d4-4a25-9077-725e01f2695c
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
correlation: qa-d0a276e3-b93d-4999-8f53-354b35943cc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0a276e3-b93d-4999-8f53-354b35943cc4
Content-Type: application/json

--- request body ---
{"handle":"qa-df99fb953742","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0a276e3-b93d-4999-8f53-354b35943cc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d0a276e3-b93d-4999-8f53-354b35943cc4"}
```
