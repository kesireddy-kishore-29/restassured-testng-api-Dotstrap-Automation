# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-099c352d-d7be-42b6-ad3d-9d0a67f8900c` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-2c46f3e2-3c46-4f37-b469-835367822c1d` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-d31a9934-fd32-42b5-9ada-901225e60f81` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-dce78077-9e64-4d58-9da4-bb2b4596b3eb` |
| 5 | `POST /v1/credits/purchases` | 422 | 13 | `qa-28adf208-ab63-48ee-8fea-9825d78c36bc` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-dc222e9e-12e3-441b-9dcb-acb5ab12cac1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-3058254b-63e3-4ca6-953f-b38978dca875` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-4a90156a-ceb4-442b-836c-dceb1ba52fdc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-514d9890-627a-437c-9a58-fa5fe4d9c7f4` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-359e6281-ab40-4ed7-af48-8528a90a31c6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-099c352d-d7be-42b6-ad3d-9d0a67f8900c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-099c352d-d7be-42b6-ad3d-9d0a67f8900c
Content-Type: application/json

--- request body ---
{"handle":"qa-ca84c5bd7f3f","displayName":"QA ca84c5bd7f3f","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-099c352d-d7be-42b6-ad3d-9d0a67f8900c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 8
Location: /v1/accounts/qa-ca84c5bd7f3f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4aabdb9b-282d-45cb-9d99-072a3dcb38b2","handle":"qa-ca84c5bd7f3f","displayName":"QA ca84c5bd7f3f","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.680434366Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2c46f3e2-3c46-4f37-b469-835367822c1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c46f3e2-3c46-4f37-b469-835367822c1d
Content-Type: application/json

--- request body ---
{"handle":"qa-cb61bf68b0cd","displayName":"QA cb61bf68b0cd","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c46f3e2-3c46-4f37-b469-835367822c1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 8
Location: /v1/accounts/qa-cb61bf68b0cd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72ee2060-0bd6-4af1-bc03-a58e4d0b01ab","handle":"qa-cb61bf68b0cd","displayName":"QA cb61bf68b0cd","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.714995864Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d31a9934-fd32-42b5-9ada-901225e60f81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d31a9934-fd32-42b5-9ada-901225e60f81
Content-Type: application/json

--- request body ---
{"handle":"qa-ca84c5bd7f3f","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d31a9934-fd32-42b5-9ada-901225e60f81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4aabdb9b-282d-45cb-9d99-072a3dcb38b2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dce78077-9e64-4d58-9da4-bb2b4596b3eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dce78077-9e64-4d58-9da4-bb2b4596b3eb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cb61bf68b0cd","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-dce78077-9e64-4d58-9da4-bb2b4596b3eb
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
Location: /v1/conversations/cnv_8fe7e39a-c287-4fdd-a11d-68138126ef02
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8fe7e39a-c287-4fdd-a11d-68138126ef02","subject":"Error contract","status":"open","region":"eu","participants":["qa-ca84c5bd7f3f","qa-cb61bf68b0cd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.757438373Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-28adf208-ab63-48ee-8fea-9825d78c36bc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-94b37f98b3604bdfb654cfd0fef69a06
X-Correlation-Id: qa-28adf208-ab63-48ee-8fea-9825d78c36bc
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-28adf208-ab63-48ee-8fea-9825d78c36bc
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-28adf208-ab63-48ee-8fea-9825d78c36bc","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dc222e9e-12e3-441b-9dcb-acb5ab12cac1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc222e9e-12e3-441b-9dcb-acb5ab12cac1
Content-Type: application/json

--- request body ---
{"handle":"qa-cb61bf68b0cd","password":"****"}

--- response: 200 in 42 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc222e9e-12e3-441b-9dcb-acb5ab12cac1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72ee2060-0bd6-4af1-bc03-a58e4d0b01ab"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3058254b-63e3-4ca6-953f-b38978dca875

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3058254b-63e3-4ca6-953f-b38978dca875
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3058254b-63e3-4ca6-953f-b38978dca875
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
correlation: qa-4a90156a-ceb4-442b-836c-dceb1ba52fdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a90156a-ceb4-442b-836c-dceb1ba52fdc
Content-Type: application/json

--- request body ---
{"handle":"qa-cb61bf68b0cd","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a90156a-ceb4-442b-836c-dceb1ba52fdc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a90156a-ceb4-442b-836c-dceb1ba52fdc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-514d9890-627a-437c-9a58-fa5fe4d9c7f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-514d9890-627a-437c-9a58-fa5fe4d9c7f4
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-514d9890-627a-437c-9a58-fa5fe4d9c7f4
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
correlation: qa-359e6281-ab40-4ed7-af48-8528a90a31c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-359e6281-ab40-4ed7-af48-8528a90a31c6
Content-Type: application/json

--- request body ---
{"handle":"qa-ca84c5bd7f3f","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-359e6281-ab40-4ed7-af48-8528a90a31c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-359e6281-ab40-4ed7-af48-8528a90a31c6"}
```
