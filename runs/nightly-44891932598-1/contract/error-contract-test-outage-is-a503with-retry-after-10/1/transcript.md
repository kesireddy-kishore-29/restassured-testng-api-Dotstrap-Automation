# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-2606f786-9a71-44cb-b200-356203b86835` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-79dbf0dc-874e-4978-ada8-4efb7d825278` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-d7e2092f-6b56-4e5c-a9ef-5a8d141dc84c` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-38606bfa-3d83-4228-927a-99af9cd818a9` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 16 | `qa-6a5ce24e-89af-4e09-bda5-d2ee87c60151` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-69ebfd5f-5334-4c23-92c3-8becff66e686` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-f5543dbe-2fc0-4cf8-8a3c-33e45999e305` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-954b191e-2a2c-42c6-a339-1f29d1dca3c3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-35ff7799-e8b4-45ad-9c09-8ec9d2b1d8b5` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-d4ee704c-86b7-483c-ad1c-ebe47bb44edf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2606f786-9a71-44cb-b200-356203b86835

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2606f786-9a71-44cb-b200-356203b86835
Content-Type: application/json

--- request body ---
{"handle":"qa-af9d2783465d","displayName":"QA af9d2783465d","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2606f786-9a71-44cb-b200-356203b86835
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 7
Location: /v1/accounts/qa-af9d2783465d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_125c1be9-e722-4058-a641-c03feb9302e8","handle":"qa-af9d2783465d","displayName":"QA af9d2783465d","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.490921961Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-79dbf0dc-874e-4978-ada8-4efb7d825278

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79dbf0dc-874e-4978-ada8-4efb7d825278
Content-Type: application/json

--- request body ---
{"handle":"qa-fb45e2dcf1b7","displayName":"QA fb45e2dcf1b7","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-79dbf0dc-874e-4978-ada8-4efb7d825278
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 7
Location: /v1/accounts/qa-fb45e2dcf1b7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_86320d5d-4e67-4164-a1be-3d9601384a7b","handle":"qa-fb45e2dcf1b7","displayName":"QA fb45e2dcf1b7","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.530850122Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d7e2092f-6b56-4e5c-a9ef-5a8d141dc84c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7e2092f-6b56-4e5c-a9ef-5a8d141dc84c
Content-Type: application/json

--- request body ---
{"handle":"qa-af9d2783465d","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7e2092f-6b56-4e5c-a9ef-5a8d141dc84c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_125c1be9-e722-4058-a641-c03feb9302e8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-38606bfa-3d83-4228-927a-99af9cd818a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38606bfa-3d83-4228-927a-99af9cd818a9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fb45e2dcf1b7","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-38606bfa-3d83-4228-927a-99af9cd818a9
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
Location: /v1/conversations/cnv_78a7838b-4057-4b0d-8e13-ba72e2db2381
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_78a7838b-4057-4b0d-8e13-ba72e2db2381","subject":"Error contract","status":"open","region":"eu","participants":["qa-af9d2783465d","qa-fb45e2dcf1b7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.626656140Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_78a7838b-4057-4b0d-8e13-ba72e2db2381/messages
correlation: qa-6a5ce24e-89af-4e09-bda5-d2ee87c60151

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 052be935-0449-4708-bc13-fc0f74a1577b
X-Correlation-Id: qa-6a5ce24e-89af-4e09-bda5-d2ee87c60151
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a5ce24e-89af-4e09-bda5-d2ee87c60151
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_78a7838b-4057-4b0d-8e13-ba72e2db2381/messages","correlationId":"qa-6a5ce24e-89af-4e09-bda5-d2ee87c60151"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-69ebfd5f-5334-4c23-92c3-8becff66e686

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69ebfd5f-5334-4c23-92c3-8becff66e686
Content-Type: application/json

--- request body ---
{"handle":"qa-fb45e2dcf1b7","password":"****"}

--- response: 200 in 38 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-69ebfd5f-5334-4c23-92c3-8becff66e686
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_86320d5d-4e67-4164-a1be-3d9601384a7b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f5543dbe-2fc0-4cf8-8a3c-33e45999e305

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5543dbe-2fc0-4cf8-8a3c-33e45999e305
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f5543dbe-2fc0-4cf8-8a3c-33e45999e305
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
correlation: qa-954b191e-2a2c-42c6-a339-1f29d1dca3c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-954b191e-2a2c-42c6-a339-1f29d1dca3c3
Content-Type: application/json

--- request body ---
{"handle":"qa-fb45e2dcf1b7","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-954b191e-2a2c-42c6-a339-1f29d1dca3c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-954b191e-2a2c-42c6-a339-1f29d1dca3c3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35ff7799-e8b4-45ad-9c09-8ec9d2b1d8b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35ff7799-e8b4-45ad-9c09-8ec9d2b1d8b5
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35ff7799-e8b4-45ad-9c09-8ec9d2b1d8b5
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
correlation: qa-d4ee704c-86b7-483c-ad1c-ebe47bb44edf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4ee704c-86b7-483c-ad1c-ebe47bb44edf
Content-Type: application/json

--- request body ---
{"handle":"qa-af9d2783465d","password":"****"}

--- response: 401 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4ee704c-86b7-483c-ad1c-ebe47bb44edf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d4ee704c-86b7-483c-ad1c-ebe47bb44edf"}
```
