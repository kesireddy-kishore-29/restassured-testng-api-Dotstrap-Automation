# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-89faf2ae-8fc5-4455-9404-5b23c199b9c3` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-c671653d-6882-4ee0-830f-22dc336eb3ac` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-d2103852-cec4-47ba-b986-d0d2506b472f` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-75347301-bd3a-49b2-ab01-01816f961073` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 23 | `qa-04619d3c-0ccf-430f-aae4-27197ae25382` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-e246a578-4e8f-4cc6-a57c-e9ceea9f9237` |
| 7 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-88b7de2e-d6d3-4abf-ac20-137e5cb5baa2` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-e41b93c2-c5e7-42e2-be84-c8d2c7c464a6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-4a2d0158-876a-4d7c-b3b7-43b540bdcaf5` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-91f68374-827d-477b-bb3f-ad13db8085b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-89faf2ae-8fc5-4455-9404-5b23c199b9c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89faf2ae-8fc5-4455-9404-5b23c199b9c3
Content-Type: application/json

--- request body ---
{"handle":"qa-f49d5e303ecd","displayName":"QA f49d5e303ecd","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-89faf2ae-8fc5-4455-9404-5b23c199b9c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 7
Location: /v1/accounts/qa-f49d5e303ecd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dc9c7883-8ed6-4e03-9f67-3a2198d7d5fb","handle":"qa-f49d5e303ecd","displayName":"QA f49d5e303ecd","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.056017814Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c671653d-6882-4ee0-830f-22dc336eb3ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c671653d-6882-4ee0-830f-22dc336eb3ac
Content-Type: application/json

--- request body ---
{"handle":"qa-5c86d0f3d0c6","displayName":"QA 5c86d0f3d0c6","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c671653d-6882-4ee0-830f-22dc336eb3ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Location: /v1/accounts/qa-5c86d0f3d0c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_de021d83-dd64-4778-947d-762dacf174ad","handle":"qa-5c86d0f3d0c6","displayName":"QA 5c86d0f3d0c6","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.095155777Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d2103852-cec4-47ba-b986-d0d2506b472f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2103852-cec4-47ba-b986-d0d2506b472f
Content-Type: application/json

--- request body ---
{"handle":"qa-f49d5e303ecd","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2103852-cec4-47ba-b986-d0d2506b472f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dc9c7883-8ed6-4e03-9f67-3a2198d7d5fb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-75347301-bd3a-49b2-ab01-01816f961073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75347301-bd3a-49b2-ab01-01816f961073
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5c86d0f3d0c6","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-75347301-bd3a-49b2-ab01-01816f961073
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
Location: /v1/conversations/cnv_37882bf5-3382-4b9f-a1e6-7ef994df05a7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_37882bf5-3382-4b9f-a1e6-7ef994df05a7","subject":"Error contract","status":"open","region":"eu","participants":["qa-f49d5e303ecd","qa-5c86d0f3d0c6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.155164796Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_37882bf5-3382-4b9f-a1e6-7ef994df05a7/messages
correlation: qa-04619d3c-0ccf-430f-aae4-27197ae25382

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04619d3c-0ccf-430f-aae4-27197ae25382
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04619d3c-0ccf-430f-aae4-27197ae25382
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_37882bf5-3382-4b9f-a1e6-7ef994df05a7/messages","correlationId":"qa-04619d3c-0ccf-430f-aae4-27197ae25382"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e246a578-4e8f-4cc6-a57c-e9ceea9f9237

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e246a578-4e8f-4cc6-a57c-e9ceea9f9237
Content-Type: application/json

--- request body ---
{"handle":"qa-5c86d0f3d0c6","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e246a578-4e8f-4cc6-a57c-e9ceea9f9237
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_de021d83-dd64-4778-947d-762dacf174ad"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-88b7de2e-d6d3-4abf-ac20-137e5cb5baa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88b7de2e-d6d3-4abf-ac20-137e5cb5baa2
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-88b7de2e-d6d3-4abf-ac20-137e5cb5baa2
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
correlation: qa-e41b93c2-c5e7-42e2-be84-c8d2c7c464a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e41b93c2-c5e7-42e2-be84-c8d2c7c464a6
Content-Type: application/json

--- request body ---
{"handle":"qa-5c86d0f3d0c6","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e41b93c2-c5e7-42e2-be84-c8d2c7c464a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e41b93c2-c5e7-42e2-be84-c8d2c7c464a6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4a2d0158-876a-4d7c-b3b7-43b540bdcaf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a2d0158-876a-4d7c-b3b7-43b540bdcaf5
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4a2d0158-876a-4d7c-b3b7-43b540bdcaf5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-91f68374-827d-477b-bb3f-ad13db8085b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91f68374-827d-477b-bb3f-ad13db8085b2
Content-Type: application/json

--- request body ---
{"handle":"qa-f49d5e303ecd","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91f68374-827d-477b-bb3f-ad13db8085b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-91f68374-827d-477b-bb3f-ad13db8085b2"}
```
