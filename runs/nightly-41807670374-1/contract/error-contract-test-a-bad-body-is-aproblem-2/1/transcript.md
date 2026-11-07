# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 461 | `qa-36dd8a6f-48e9-4e21-997c-cc25868c3f88` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-7d40f3df-ae10-4323-a3e2-a0dd2e9092bd` |
| 3 | `POST /v1/auth/token` | 200 | 59 | `qa-d77cc7ba-09d3-4c20-b9a8-5c7b33d4c216` |
| 4 | `POST /v1/conversations` | 201 | 49 | `qa-9f47f51e-b400-48bf-af81-ab44a37cc5ca` |
| 5 | `POST /v1/auth/token` | 422 | 61 | `qa-9fec002f-1c24-4046-af3d-2d3924aa108b` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-86e99512-361e-4acd-9df1-596498e58cb4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-8e1e8844-6349-44b8-8ba3-884db5d29e43` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-d5a6e80d-e13f-452b-a34a-d5da33829f62` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-eadaca51-da1a-4afb-a697-3ed800950d3f` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-979b4b51-37ea-4d81-8a9b-8221a6c19405` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-36dd8a6f-48e9-4e21-997c-cc25868c3f88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36dd8a6f-48e9-4e21-997c-cc25868c3f88
Content-Type: application/json

--- request body ---
{"handle":"qa-b60c31e3c61c","displayName":"QA b60c31e3c61c","password":"****","region":"eu"}

--- response: 201 in 461 ms ---
Date: Wed, 04 Nov 2026 09:28:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-36dd8a6f-48e9-4e21-997c-cc25868c3f88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Location: /v1/accounts/qa-b60c31e3c61c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_af9ac256-0821-4640-ad98-44cb032e922f","handle":"qa-b60c31e3c61c","displayName":"QA b60c31e3c61c","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.108449071Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7d40f3df-ae10-4323-a3e2-a0dd2e9092bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d40f3df-ae10-4323-a3e2-a0dd2e9092bd
Content-Type: application/json

--- request body ---
{"handle":"qa-8665486a9724","displayName":"QA 8665486a9724","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d40f3df-ae10-4323-a3e2-a0dd2e9092bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Location: /v1/accounts/qa-8665486a9724
X-Served-Region: eu
Content-Length: 181

{"id":"acc_493ec5f1-5463-411a-8578-27cfee80c746","handle":"qa-8665486a9724","displayName":"QA 8665486a9724","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.359250243Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d77cc7ba-09d3-4c20-b9a8-5c7b33d4c216

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d77cc7ba-09d3-4c20-b9a8-5c7b33d4c216
Content-Type: application/json

--- request body ---
{"handle":"qa-b60c31e3c61c","password":"****"}

--- response: 200 in 59 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d77cc7ba-09d3-4c20-b9a8-5c7b33d4c216
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af9ac256-0821-4640-ad98-44cb032e922f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9f47f51e-b400-48bf-af81-ab44a37cc5ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f47f51e-b400-48bf-af81-ab44a37cc5ca
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8665486a9724","subject":"Error contract","message":"Hi"}

--- response: 201 in 49 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f47f51e-b400-48bf-af81-ab44a37cc5ca
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
Location: /v1/conversations/cnv_05a94e15-efad-4b58-b4d9-af08c187ebe8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_05a94e15-efad-4b58-b4d9-af08c187ebe8","subject":"Error contract","status":"open","region":"eu","participants":["qa-b60c31e3c61c","qa-8665486a9724"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:01.526038710Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9fec002f-1c24-4046-af3d-2d3924aa108b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fec002f-1c24-4046-af3d-2d3924aa108b
Content-Type: application/json

--- request body ---
{"handle":"qa-b60c31e3c61c","password":"****","ttlSeconds":0}

--- response: 422 in 61 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fec002f-1c24-4046-af3d-2d3924aa108b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 10
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-9fec002f-1c24-4046-af3d-2d3924aa108b","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-86e99512-361e-4acd-9df1-596498e58cb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86e99512-361e-4acd-9df1-596498e58cb4
Content-Type: application/json

--- request body ---
{"handle":"qa-8665486a9724","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-86e99512-361e-4acd-9df1-596498e58cb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_493ec5f1-5463-411a-8578-27cfee80c746"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e1e8844-6349-44b8-8ba3-884db5d29e43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e1e8844-6349-44b8-8ba3-884db5d29e43
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e1e8844-6349-44b8-8ba3-884db5d29e43
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
correlation: qa-d5a6e80d-e13f-452b-a34a-d5da33829f62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5a6e80d-e13f-452b-a34a-d5da33829f62
Content-Type: application/json

--- request body ---
{"handle":"qa-8665486a9724","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5a6e80d-e13f-452b-a34a-d5da33829f62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d5a6e80d-e13f-452b-a34a-d5da33829f62"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eadaca51-da1a-4afb-a697-3ed800950d3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eadaca51-da1a-4afb-a697-3ed800950d3f
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eadaca51-da1a-4afb-a697-3ed800950d3f
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
correlation: qa-979b4b51-37ea-4d81-8a9b-8221a6c19405

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-979b4b51-37ea-4d81-8a9b-8221a6c19405
Content-Type: application/json

--- request body ---
{"handle":"qa-b60c31e3c61c","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-979b4b51-37ea-4d81-8a9b-8221a6c19405
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-979b4b51-37ea-4d81-8a9b-8221a6c19405"}
```
