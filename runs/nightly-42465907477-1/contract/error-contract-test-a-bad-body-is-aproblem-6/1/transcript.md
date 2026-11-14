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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-221b5bc0-3281-4e45-8466-95ba73648b61` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-de554e3e-0628-47db-9614-a53204708ae6` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-2948c80f-aa15-4538-9a51-0c460c075cb3` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-5f35f4ed-7b92-494d-a376-b1e6add66687` |
| 5 | `PATCH /v1/accounts/me` | 400 | 14 | `qa-885ebf50-40a5-4840-8522-ad486c84ea6f` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-626470aa-0112-40ab-aa37-796ff1546713` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-99d9630a-50b8-4f96-883b-5e97f4687823` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-80a8561b-3665-47da-920a-2532a2357d57` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-4122e7a8-71d5-4d55-948d-de836ebfefbd` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-c3c99096-1ac9-4d9b-90cd-ddf19113fb5d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-221b5bc0-3281-4e45-8466-95ba73648b61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-221b5bc0-3281-4e45-8466-95ba73648b61
Content-Type: application/json

--- request body ---
{"handle":"qa-3b1d66dcdf6c","displayName":"QA 3b1d66dcdf6c","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-221b5bc0-3281-4e45-8466-95ba73648b61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 9
Location: /v1/accounts/qa-3b1d66dcdf6c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_065bff78-f35c-49c9-83c5-2e6c8563c778","handle":"qa-3b1d66dcdf6c","displayName":"QA 3b1d66dcdf6c","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.676170111Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-de554e3e-0628-47db-9614-a53204708ae6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de554e3e-0628-47db-9614-a53204708ae6
Content-Type: application/json

--- request body ---
{"handle":"qa-58f5dc03c211","displayName":"QA 58f5dc03c211","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-de554e3e-0628-47db-9614-a53204708ae6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 9
Location: /v1/accounts/qa-58f5dc03c211
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fdc4fb4-6679-48cb-9a0a-77e014991907","handle":"qa-58f5dc03c211","displayName":"QA 58f5dc03c211","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.709326458Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2948c80f-aa15-4538-9a51-0c460c075cb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2948c80f-aa15-4538-9a51-0c460c075cb3
Content-Type: application/json

--- request body ---
{"handle":"qa-3b1d66dcdf6c","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2948c80f-aa15-4538-9a51-0c460c075cb3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_065bff78-f35c-49c9-83c5-2e6c8563c778"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5f35f4ed-7b92-494d-a376-b1e6add66687

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f35f4ed-7b92-494d-a376-b1e6add66687
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-58f5dc03c211","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f35f4ed-7b92-494d-a376-b1e6add66687
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
Location: /v1/conversations/cnv_3d3b7dad-b47a-4c6a-95e2-a36b15ca5fde
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3d3b7dad-b47a-4c6a-95e2-a36b15ca5fde","subject":"Error contract","status":"open","region":"eu","participants":["qa-3b1d66dcdf6c","qa-58f5dc03c211"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:02.755032645Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-885ebf50-40a5-4840-8522-ad486c84ea6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-885ebf50-40a5-4840-8522-ad486c84ea6f
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-885ebf50-40a5-4840-8522-ad486c84ea6f
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-885ebf50-40a5-4840-8522-ad486c84ea6f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-626470aa-0112-40ab-aa37-796ff1546713

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-626470aa-0112-40ab-aa37-796ff1546713
Content-Type: application/json

--- request body ---
{"handle":"qa-58f5dc03c211","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-626470aa-0112-40ab-aa37-796ff1546713
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5fdc4fb4-6679-48cb-9a0a-77e014991907"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-99d9630a-50b8-4f96-883b-5e97f4687823

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99d9630a-50b8-4f96-883b-5e97f4687823
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-99d9630a-50b8-4f96-883b-5e97f4687823
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
correlation: qa-80a8561b-3665-47da-920a-2532a2357d57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80a8561b-3665-47da-920a-2532a2357d57
Content-Type: application/json

--- request body ---
{"handle":"qa-58f5dc03c211","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80a8561b-3665-47da-920a-2532a2357d57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-80a8561b-3665-47da-920a-2532a2357d57"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4122e7a8-71d5-4d55-948d-de836ebfefbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4122e7a8-71d5-4d55-948d-de836ebfefbd
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4122e7a8-71d5-4d55-948d-de836ebfefbd
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
correlation: qa-c3c99096-1ac9-4d9b-90cd-ddf19113fb5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3c99096-1ac9-4d9b-90cd-ddf19113fb5d
Content-Type: application/json

--- request body ---
{"handle":"qa-3b1d66dcdf6c","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3c99096-1ac9-4d9b-90cd-ddf19113fb5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c3c99096-1ac9-4d9b-90cd-ddf19113fb5d"}
```
