# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-f486a0c1-7bb4-4ac9-85b6-4e2692ac5bf6` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-9c7be682-1fed-48bf-b52d-5c9781e1f9b4` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-52fa656f-7412-43b8-b23b-5250c9ea0cf8` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-ff2d1ca0-fabe-48ea-a314-83739acd6d90` |
| 5 | `POST /v1/conversations` | 400 | 24 | `qa-10b19d7a-40b1-4dfe-8318-b5f5f7f85141` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-5d334e12-71b9-4bff-a8b6-2ee0ce57c660` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-51c0ed7f-2b21-47b0-b3c4-a0551982e9d9` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-c99ef19d-5754-43b4-96c3-5e635d878530` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-d7a4bf80-4c1d-42b5-80cc-942f07f23a38` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-74689ff6-c4ab-4b05-8f49-cc08daa151f2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f486a0c1-7bb4-4ac9-85b6-4e2692ac5bf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f486a0c1-7bb4-4ac9-85b6-4e2692ac5bf6
Content-Type: application/json

--- request body ---
{"handle":"qa-f59f45f3a28f","displayName":"QA f59f45f3a28f","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f486a0c1-7bb4-4ac9-85b6-4e2692ac5bf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 7
Location: /v1/accounts/qa-f59f45f3a28f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_12cf5d6f-5431-40ef-bc35-fb3bc53acf90","handle":"qa-f59f45f3a28f","displayName":"QA f59f45f3a28f","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.247692531Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9c7be682-1fed-48bf-b52d-5c9781e1f9b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c7be682-1fed-48bf-b52d-5c9781e1f9b4
Content-Type: application/json

--- request body ---
{"handle":"qa-93a99b0c2cf0","displayName":"QA 93a99b0c2cf0","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c7be682-1fed-48bf-b52d-5c9781e1f9b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 7
Location: /v1/accounts/qa-93a99b0c2cf0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20def770-4dc1-457a-a8e3-0761e7790f7f","handle":"qa-93a99b0c2cf0","displayName":"QA 93a99b0c2cf0","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.299322130Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-52fa656f-7412-43b8-b23b-5250c9ea0cf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52fa656f-7412-43b8-b23b-5250c9ea0cf8
Content-Type: application/json

--- request body ---
{"handle":"qa-f59f45f3a28f","password":"****"}

--- response: 200 in 40 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-52fa656f-7412-43b8-b23b-5250c9ea0cf8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12cf5d6f-5431-40ef-bc35-fb3bc53acf90"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ff2d1ca0-fabe-48ea-a314-83739acd6d90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff2d1ca0-fabe-48ea-a314-83739acd6d90
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-93a99b0c2cf0","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff2d1ca0-fabe-48ea-a314-83739acd6d90
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
Location: /v1/conversations/cnv_78b328b2-0efe-48dc-8895-f0f2fd1fdf5f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_78b328b2-0efe-48dc-8895-f0f2fd1fdf5f","subject":"Error contract","status":"open","region":"eu","participants":["qa-f59f45f3a28f","qa-93a99b0c2cf0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.391411303Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-10b19d7a-40b1-4dfe-8318-b5f5f7f85141

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10b19d7a-40b1-4dfe-8318-b5f5f7f85141
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10b19d7a-40b1-4dfe-8318-b5f5f7f85141
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-10b19d7a-40b1-4dfe-8318-b5f5f7f85141"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5d334e12-71b9-4bff-a8b6-2ee0ce57c660

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d334e12-71b9-4bff-a8b6-2ee0ce57c660
Content-Type: application/json

--- request body ---
{"handle":"qa-93a99b0c2cf0","password":"****"}

--- response: 200 in 29 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d334e12-71b9-4bff-a8b6-2ee0ce57c660
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20def770-4dc1-457a-a8e3-0761e7790f7f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-51c0ed7f-2b21-47b0-b3c4-a0551982e9d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51c0ed7f-2b21-47b0-b3c4-a0551982e9d9
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-51c0ed7f-2b21-47b0-b3c4-a0551982e9d9
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
correlation: qa-c99ef19d-5754-43b4-96c3-5e635d878530

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c99ef19d-5754-43b4-96c3-5e635d878530
Content-Type: application/json

--- request body ---
{"handle":"qa-93a99b0c2cf0","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c99ef19d-5754-43b4-96c3-5e635d878530
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c99ef19d-5754-43b4-96c3-5e635d878530"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7a4bf80-4c1d-42b5-80cc-942f07f23a38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7a4bf80-4c1d-42b5-80cc-942f07f23a38
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7a4bf80-4c1d-42b5-80cc-942f07f23a38
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
correlation: qa-74689ff6-c4ab-4b05-8f49-cc08daa151f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74689ff6-c4ab-4b05-8f49-cc08daa151f2
Content-Type: application/json

--- request body ---
{"handle":"qa-f59f45f3a28f","password":"****"}

--- response: 401 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74689ff6-c4ab-4b05-8f49-cc08daa151f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-74689ff6-c4ab-4b05-8f49-cc08daa151f2"}
```
