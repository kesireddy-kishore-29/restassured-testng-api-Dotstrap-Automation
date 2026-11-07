# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 59 | `qa-b1865a46-9510-44e9-b568-5e9ba0c209e6` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-e60c3b47-a3d1-4825-8084-10254ab7ffd9` |
| 3 | `POST /v1/auth/token` | 200 | 71 | `qa-344d3571-b899-4859-8acf-79738d562527` |
| 4 | `POST /v1/conversations` | 201 | 33 | `qa-cce6087c-50e0-48e6-9449-cccc5404e7bb` |
| 5 | `PATCH /v1/accounts/me` | 415 | 41 | `qa-b4d82e90-4cce-4bb4-a16e-fff6427fb103` |
| 6 | `POST /v1/auth/token` | 200 | 74 | `qa-96e35695-0e09-4b30-a9ef-8801db099d1e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-22cdbac8-6d44-43e9-aea1-41ad8bface3f` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-cd82d682-b81f-4514-bad7-143ae222757b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-0463de62-aa8f-4803-9a17-57ae91b96e52` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-989cdd01-91c4-4445-b0fb-630947a2ef78` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b1865a46-9510-44e9-b568-5e9ba0c209e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1865a46-9510-44e9-b568-5e9ba0c209e6
Content-Type: application/json

--- request body ---
{"handle":"qa-99ee66ee5822","displayName":"QA 99ee66ee5822","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1865a46-9510-44e9-b568-5e9ba0c209e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Location: /v1/accounts/qa-99ee66ee5822
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1a3ad3a-cf25-4d32-ad14-3a3a2d6ef444","handle":"qa-99ee66ee5822","displayName":"QA 99ee66ee5822","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.772345402Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e60c3b47-a3d1-4825-8084-10254ab7ffd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e60c3b47-a3d1-4825-8084-10254ab7ffd9
Content-Type: application/json

--- request body ---
{"handle":"qa-6e98daed9acc","displayName":"QA 6e98daed9acc","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e60c3b47-a3d1-4825-8084-10254ab7ffd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Location: /v1/accounts/qa-6e98daed9acc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_63a545b8-9f61-4d9c-b4e8-8b84bdb8e264","handle":"qa-6e98daed9acc","displayName":"QA 6e98daed9acc","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.828672816Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-344d3571-b899-4859-8acf-79738d562527

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-344d3571-b899-4859-8acf-79738d562527
Content-Type: application/json

--- request body ---
{"handle":"qa-99ee66ee5822","password":"****"}

--- response: 200 in 71 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-344d3571-b899-4859-8acf-79738d562527
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1a3ad3a-cf25-4d32-ad14-3a3a2d6ef444"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cce6087c-50e0-48e6-9449-cccc5404e7bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cce6087c-50e0-48e6-9449-cccc5404e7bb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6e98daed9acc","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-cce6087c-50e0-48e6-9449-cccc5404e7bb
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
Location: /v1/conversations/cnv_568f4d45-0ea8-41a3-85c9-0471cd9d46d8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_568f4d45-0ea8-41a3-85c9-0471cd9d46d8","subject":"Error contract","status":"open","region":"eu","participants":["qa-99ee66ee5822","qa-6e98daed9acc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:59.976106359Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-b4d82e90-4cce-4bb4-a16e-fff6427fb103

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4d82e90-4cce-4bb4-a16e-fff6427fb103
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 41 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4d82e90-4cce-4bb4-a16e-fff6427fb103
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-b4d82e90-4cce-4bb4-a16e-fff6427fb103"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-96e35695-0e09-4b30-a9ef-8801db099d1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96e35695-0e09-4b30-a9ef-8801db099d1e
Content-Type: application/json

--- request body ---
{"handle":"qa-6e98daed9acc","password":"****"}

--- response: 200 in 74 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-96e35695-0e09-4b30-a9ef-8801db099d1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_63a545b8-9f61-4d9c-b4e8-8b84bdb8e264"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-22cdbac8-6d44-43e9-aea1-41ad8bface3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22cdbac8-6d44-43e9-aea1-41ad8bface3f
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-22cdbac8-6d44-43e9-aea1-41ad8bface3f
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
correlation: qa-cd82d682-b81f-4514-bad7-143ae222757b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd82d682-b81f-4514-bad7-143ae222757b
Content-Type: application/json

--- request body ---
{"handle":"qa-6e98daed9acc","password":"****"}

--- response: 401 in 23 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd82d682-b81f-4514-bad7-143ae222757b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cd82d682-b81f-4514-bad7-143ae222757b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0463de62-aa8f-4803-9a17-57ae91b96e52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0463de62-aa8f-4803-9a17-57ae91b96e52
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0463de62-aa8f-4803-9a17-57ae91b96e52
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
correlation: qa-989cdd01-91c4-4445-b0fb-630947a2ef78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-989cdd01-91c4-4445-b0fb-630947a2ef78
Content-Type: application/json

--- request body ---
{"handle":"qa-99ee66ee5822","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-989cdd01-91c4-4445-b0fb-630947a2ef78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-989cdd01-91c4-4445-b0fb-630947a2ef78"}
```
