# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-08a206eb-77df-420c-b909-ecaf171c24d4` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-fa4f53d7-8def-4d84-885c-0a23c25578d0` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-f1311e65-9e5d-4c8a-b126-dc06cbe51744` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-3691afb7-0482-4da4-b19e-c4bc551df218` |
| 5 | `POST /v1/conversations` | 415 | 28 | `qa-78790ee9-b69e-4139-aad5-82b08ed3dcda` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-be4af034-2095-40c6-ab88-89c4625c17a1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-85379164-7fed-471b-bd4b-b9db8a525235` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-a8701600-6764-4a86-8cdf-0e5d0035a6f2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-fbbad25f-454a-4e22-a354-9a86dd70f398` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-e7fc551b-2486-4ec7-9137-80e658c21f6c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-08a206eb-77df-420c-b909-ecaf171c24d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08a206eb-77df-420c-b909-ecaf171c24d4
Content-Type: application/json

--- request body ---
{"handle":"qa-54db5c8193c9","displayName":"QA 54db5c8193c9","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-08a206eb-77df-420c-b909-ecaf171c24d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Location: /v1/accounts/qa-54db5c8193c9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3486ea7d-3229-45c9-b391-ba7f10150745","handle":"qa-54db5c8193c9","displayName":"QA 54db5c8193c9","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.052562194Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fa4f53d7-8def-4d84-885c-0a23c25578d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa4f53d7-8def-4d84-885c-0a23c25578d0
Content-Type: application/json

--- request body ---
{"handle":"qa-83a602ca02ec","displayName":"QA 83a602ca02ec","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa4f53d7-8def-4d84-885c-0a23c25578d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Location: /v1/accounts/qa-83a602ca02ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3dbde333-89d9-4717-ba3d-5c71bb282733","handle":"qa-83a602ca02ec","displayName":"QA 83a602ca02ec","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.103907167Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f1311e65-9e5d-4c8a-b126-dc06cbe51744

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1311e65-9e5d-4c8a-b126-dc06cbe51744
Content-Type: application/json

--- request body ---
{"handle":"qa-54db5c8193c9","password":"****"}

--- response: 200 in 46 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1311e65-9e5d-4c8a-b126-dc06cbe51744
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3486ea7d-3229-45c9-b391-ba7f10150745"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3691afb7-0482-4da4-b19e-c4bc551df218

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3691afb7-0482-4da4-b19e-c4bc551df218
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-83a602ca02ec","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-3691afb7-0482-4da4-b19e-c4bc551df218
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
Location: /v1/conversations/cnv_1823f602-5706-4067-b5f0-e915e8dd8776
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1823f602-5706-4067-b5f0-e915e8dd8776","subject":"Error contract","status":"open","region":"eu","participants":["qa-54db5c8193c9","qa-83a602ca02ec"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.204794787Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-78790ee9-b69e-4139-aad5-82b08ed3dcda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78790ee9-b69e-4139-aad5-82b08ed3dcda
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78790ee9-b69e-4139-aad5-82b08ed3dcda
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-78790ee9-b69e-4139-aad5-82b08ed3dcda"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-be4af034-2095-40c6-ab88-89c4625c17a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be4af034-2095-40c6-ab88-89c4625c17a1
Content-Type: application/json

--- request body ---
{"handle":"qa-83a602ca02ec","password":"****"}

--- response: 200 in 34 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-be4af034-2095-40c6-ab88-89c4625c17a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3dbde333-89d9-4717-ba3d-5c71bb282733"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85379164-7fed-471b-bd4b-b9db8a525235

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85379164-7fed-471b-bd4b-b9db8a525235
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85379164-7fed-471b-bd4b-b9db8a525235
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
correlation: qa-a8701600-6764-4a86-8cdf-0e5d0035a6f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8701600-6764-4a86-8cdf-0e5d0035a6f2
Content-Type: application/json

--- request body ---
{"handle":"qa-83a602ca02ec","password":"****"}

--- response: 401 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8701600-6764-4a86-8cdf-0e5d0035a6f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a8701600-6764-4a86-8cdf-0e5d0035a6f2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fbbad25f-454a-4e22-a354-9a86dd70f398

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbbad25f-454a-4e22-a354-9a86dd70f398
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fbbad25f-454a-4e22-a354-9a86dd70f398
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
correlation: qa-e7fc551b-2486-4ec7-9137-80e658c21f6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7fc551b-2486-4ec7-9137-80e658c21f6c
Content-Type: application/json

--- request body ---
{"handle":"qa-54db5c8193c9","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7fc551b-2486-4ec7-9137-80e658c21f6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e7fc551b-2486-4ec7-9137-80e658c21f6c"}
```
