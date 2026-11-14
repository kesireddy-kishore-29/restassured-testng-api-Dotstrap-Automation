# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-0ad3683f-89f6-4f9a-b1cc-061087ce7f99` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-a8651764-7847-4ccc-b5ee-d80338c38fb2` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-c811f34b-779d-416c-93e5-7446a857d17d` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-86829234-566d-468c-b2d9-b030f64cc0f7` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 29 | `qa-1a03dff3-d8da-488a-9a7f-58d1e7b4f83d` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-8ea2a4fa-4d9c-4135-b049-c512840a2b7b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-9e2207af-4da2-45a4-bb2d-48eaee52615f` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-0fc3b73a-bb18-40ca-9d22-6c1634fbd89b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-5a374827-11c3-46d8-9132-18fab86bf6ad` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-a74e74e8-551a-485b-a34b-f6b1e4cd7204` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0ad3683f-89f6-4f9a-b1cc-061087ce7f99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ad3683f-89f6-4f9a-b1cc-061087ce7f99
Content-Type: application/json

--- request body ---
{"handle":"qa-b3f2af16a5f5","displayName":"QA b3f2af16a5f5","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ad3683f-89f6-4f9a-b1cc-061087ce7f99
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
Location: /v1/accounts/qa-b3f2af16a5f5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3ca6b431-8865-4d1e-ac02-a427a1d26cf3","handle":"qa-b3f2af16a5f5","displayName":"QA b3f2af16a5f5","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.867675223Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a8651764-7847-4ccc-b5ee-d80338c38fb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8651764-7847-4ccc-b5ee-d80338c38fb2
Content-Type: application/json

--- request body ---
{"handle":"qa-4c52a0bdbc3d","displayName":"QA 4c52a0bdbc3d","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8651764-7847-4ccc-b5ee-d80338c38fb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 8
Location: /v1/accounts/qa-4c52a0bdbc3d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_058d1f8f-89ec-474a-b915-b720f2e0c2f8","handle":"qa-4c52a0bdbc3d","displayName":"QA 4c52a0bdbc3d","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.888750331Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c811f34b-779d-416c-93e5-7446a857d17d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c811f34b-779d-416c-93e5-7446a857d17d
Content-Type: application/json

--- request body ---
{"handle":"qa-b3f2af16a5f5","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c811f34b-779d-416c-93e5-7446a857d17d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ca6b431-8865-4d1e-ac02-a427a1d26cf3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-86829234-566d-468c-b2d9-b030f64cc0f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86829234-566d-468c-b2d9-b030f64cc0f7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4c52a0bdbc3d","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-86829234-566d-468c-b2d9-b030f64cc0f7
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
Location: /v1/conversations/cnv_c0d3ee28-2c40-4844-8eec-82cd4b50f8d4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c0d3ee28-2c40-4844-8eec-82cd4b50f8d4","subject":"Error contract","status":"open","region":"eu","participants":["qa-b3f2af16a5f5","qa-4c52a0bdbc3d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.943993353Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c0d3ee28-2c40-4844-8eec-82cd4b50f8d4/messages
correlation: qa-1a03dff3-d8da-488a-9a7f-58d1e7b4f83d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a03dff3-d8da-488a-9a7f-58d1e7b4f83d
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 29 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a03dff3-d8da-488a-9a7f-58d1e7b4f83d
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_c0d3ee28-2c40-4844-8eec-82cd4b50f8d4/messages","correlationId":"qa-1a03dff3-d8da-488a-9a7f-58d1e7b4f83d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8ea2a4fa-4d9c-4135-b049-c512840a2b7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ea2a4fa-4d9c-4135-b049-c512840a2b7b
Content-Type: application/json

--- request body ---
{"handle":"qa-4c52a0bdbc3d","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ea2a4fa-4d9c-4135-b049-c512840a2b7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_058d1f8f-89ec-474a-b915-b720f2e0c2f8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9e2207af-4da2-45a4-bb2d-48eaee52615f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e2207af-4da2-45a4-bb2d-48eaee52615f
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9e2207af-4da2-45a4-bb2d-48eaee52615f
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
correlation: qa-0fc3b73a-bb18-40ca-9d22-6c1634fbd89b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fc3b73a-bb18-40ca-9d22-6c1634fbd89b
Content-Type: application/json

--- request body ---
{"handle":"qa-4c52a0bdbc3d","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0fc3b73a-bb18-40ca-9d22-6c1634fbd89b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0fc3b73a-bb18-40ca-9d22-6c1634fbd89b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5a374827-11c3-46d8-9132-18fab86bf6ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a374827-11c3-46d8-9132-18fab86bf6ad
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5a374827-11c3-46d8-9132-18fab86bf6ad
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
correlation: qa-a74e74e8-551a-485b-a34b-f6b1e4cd7204

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a74e74e8-551a-485b-a34b-f6b1e4cd7204
Content-Type: application/json

--- request body ---
{"handle":"qa-b3f2af16a5f5","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a74e74e8-551a-485b-a34b-f6b1e4cd7204
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a74e74e8-551a-485b-a34b-f6b1e4cd7204"}
```
