# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-1bdc4d36-5589-43cf-93b4-756181908476` |
| 2 | `POST /v1/accounts` | 201 | 55 | `qa-4cb14e1a-c078-45b2-a68c-2fa6bc914121` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-296ba0cd-affa-4eec-82ad-84f0759608f4` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-8239efa1-fe58-40b1-ada4-6e85e0bf48b2` |
| 5 | `PATCH /v1/accounts/me` | 400 | 24 | `qa-9059afde-6245-445f-b0ed-39bed5fec6b0` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-d5ace974-3b33-4dde-80f7-56a53f5059fd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-75c25b7a-2d6c-4a13-bc9b-0cade4c85233` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-a6391c76-063b-4b2d-bf6a-385a45b25e8c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-777d0021-56ba-4167-9f2c-d6206b5ad0bf` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-ada6ed93-5731-4d4e-9810-832dd44a88ef` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1bdc4d36-5589-43cf-93b4-756181908476

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bdc4d36-5589-43cf-93b4-756181908476
Content-Type: application/json

--- request body ---
{"handle":"qa-672926ba2457","displayName":"QA 672926ba2457","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bdc4d36-5589-43cf-93b4-756181908476
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Location: /v1/accounts/qa-672926ba2457
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e628cad-b45d-4209-b862-678f132bae17","handle":"qa-672926ba2457","displayName":"QA 672926ba2457","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.329287761Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4cb14e1a-c078-45b2-a68c-2fa6bc914121

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cb14e1a-c078-45b2-a68c-2fa6bc914121
Content-Type: application/json

--- request body ---
{"handle":"qa-e20a32be8139","displayName":"QA e20a32be8139","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cb14e1a-c078-45b2-a68c-2fa6bc914121
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 9
Location: /v1/accounts/qa-e20a32be8139
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d57b49ba-bd92-4938-9d1f-24b477295452","handle":"qa-e20a32be8139","displayName":"QA e20a32be8139","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.396730424Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-296ba0cd-affa-4eec-82ad-84f0759608f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-296ba0cd-affa-4eec-82ad-84f0759608f4
Content-Type: application/json

--- request body ---
{"handle":"qa-672926ba2457","password":"****"}

--- response: 200 in 34 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-296ba0cd-affa-4eec-82ad-84f0759608f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e628cad-b45d-4209-b862-678f132bae17"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8239efa1-fe58-40b1-ada4-6e85e0bf48b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8239efa1-fe58-40b1-ada4-6e85e0bf48b2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e20a32be8139","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8239efa1-fe58-40b1-ada4-6e85e0bf48b2
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
Location: /v1/conversations/cnv_c02c50e6-f2a6-4f56-a2a0-6e6292a08581
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c02c50e6-f2a6-4f56-a2a0-6e6292a08581","subject":"Error contract","status":"open","region":"eu","participants":["qa-672926ba2457","qa-e20a32be8139"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.488286207Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-9059afde-6245-445f-b0ed-39bed5fec6b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9059afde-6245-445f-b0ed-39bed5fec6b0
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 24 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9059afde-6245-445f-b0ed-39bed5fec6b0
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-9059afde-6245-445f-b0ed-39bed5fec6b0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d5ace974-3b33-4dde-80f7-56a53f5059fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5ace974-3b33-4dde-80f7-56a53f5059fd
Content-Type: application/json

--- request body ---
{"handle":"qa-e20a32be8139","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5ace974-3b33-4dde-80f7-56a53f5059fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d57b49ba-bd92-4938-9d1f-24b477295452"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-75c25b7a-2d6c-4a13-bc9b-0cade4c85233

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75c25b7a-2d6c-4a13-bc9b-0cade4c85233
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-75c25b7a-2d6c-4a13-bc9b-0cade4c85233
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
correlation: qa-a6391c76-063b-4b2d-bf6a-385a45b25e8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6391c76-063b-4b2d-bf6a-385a45b25e8c
Content-Type: application/json

--- request body ---
{"handle":"qa-e20a32be8139","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6391c76-063b-4b2d-bf6a-385a45b25e8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a6391c76-063b-4b2d-bf6a-385a45b25e8c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-777d0021-56ba-4167-9f2c-d6206b5ad0bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-777d0021-56ba-4167-9f2c-d6206b5ad0bf
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-777d0021-56ba-4167-9f2c-d6206b5ad0bf
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
correlation: qa-ada6ed93-5731-4d4e-9810-832dd44a88ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ada6ed93-5731-4d4e-9810-832dd44a88ef
Content-Type: application/json

--- request body ---
{"handle":"qa-672926ba2457","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ada6ed93-5731-4d4e-9810-832dd44a88ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ada6ed93-5731-4d4e-9810-832dd44a88ef"}
```
