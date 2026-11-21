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
| 1 | `POST /v1/accounts` | 201 | 70 | `qa-e5a87129-4296-49c8-844f-d4d1d0d69518` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-4f1b679e-ea1d-4fe5-b33a-7842a6ca1021` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-49d4adf9-e8c7-442b-a0b1-d9e79699c271` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-39eb5833-fea8-484d-b59a-72c8e945dbda` |
| 5 | `POST /v1/auth/token` | 422 | 66 | `qa-0e8d2c6e-0e25-4084-9baf-ee4ec0275eac` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-4778eaba-ad9b-49ef-b7c7-63b9f7b664b9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-92d29113-b42f-4a02-b67a-821080e27eb3` |
| 8 | `POST /v1/auth/token` | 401 | 44 | `qa-b57afff6-a099-4f85-a0d8-4aa91a14cc9c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-6a2be61d-63a2-42fb-a3fd-238891f4fa21` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-7c802229-e011-4eb3-9148-1f9f55798f11` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e5a87129-4296-49c8-844f-d4d1d0d69518

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5a87129-4296-49c8-844f-d4d1d0d69518
Content-Type: application/json

--- request body ---
{"handle":"qa-414842580430","displayName":"QA 414842580430","password":"****","region":"eu"}

--- response: 201 in 70 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5a87129-4296-49c8-844f-d4d1d0d69518
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-414842580430
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea189631-bd87-4902-93fe-98ed02d67ebf","handle":"qa-414842580430","displayName":"QA 414842580430","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.592588277Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4f1b679e-ea1d-4fe5-b33a-7842a6ca1021

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f1b679e-ea1d-4fe5-b33a-7842a6ca1021
Content-Type: application/json

--- request body ---
{"handle":"qa-17d4724f2634","displayName":"QA 17d4724f2634","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f1b679e-ea1d-4fe5-b33a-7842a6ca1021
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Location: /v1/accounts/qa-17d4724f2634
X-Served-Region: eu
Content-Length: 181

{"id":"acc_40ec1109-8d02-457f-85fc-9a0c56477c05","handle":"qa-17d4724f2634","displayName":"QA 17d4724f2634","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.655070128Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-49d4adf9-e8c7-442b-a0b1-d9e79699c271

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49d4adf9-e8c7-442b-a0b1-d9e79699c271
Content-Type: application/json

--- request body ---
{"handle":"qa-414842580430","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-49d4adf9-e8c7-442b-a0b1-d9e79699c271
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea189631-bd87-4902-93fe-98ed02d67ebf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-39eb5833-fea8-484d-b59a-72c8e945dbda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39eb5833-fea8-484d-b59a-72c8e945dbda
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-17d4724f2634","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-39eb5833-fea8-484d-b59a-72c8e945dbda
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
Location: /v1/conversations/cnv_d1d74698-2b6d-4477-90e8-bb99a6af66f6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d1d74698-2b6d-4477-90e8-bb99a6af66f6","subject":"Error contract","status":"open","region":"eu","participants":["qa-414842580430","qa-17d4724f2634"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.724179233Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-0e8d2c6e-0e25-4084-9baf-ee4ec0275eac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e8d2c6e-0e25-4084-9baf-ee4ec0275eac
Content-Type: application/json

--- request body ---
{"handle":"qa-414842580430","password":"****","ttlSeconds":0}

--- response: 422 in 66 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e8d2c6e-0e25-4084-9baf-ee4ec0275eac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-0e8d2c6e-0e25-4084-9baf-ee4ec0275eac","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4778eaba-ad9b-49ef-b7c7-63b9f7b664b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4778eaba-ad9b-49ef-b7c7-63b9f7b664b9
Content-Type: application/json

--- request body ---
{"handle":"qa-17d4724f2634","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4778eaba-ad9b-49ef-b7c7-63b9f7b664b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_40ec1109-8d02-457f-85fc-9a0c56477c05"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-92d29113-b42f-4a02-b67a-821080e27eb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92d29113-b42f-4a02-b67a-821080e27eb3
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-92d29113-b42f-4a02-b67a-821080e27eb3
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
correlation: qa-b57afff6-a099-4f85-a0d8-4aa91a14cc9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b57afff6-a099-4f85-a0d8-4aa91a14cc9c
Content-Type: application/json

--- request body ---
{"handle":"qa-17d4724f2634","password":"****"}

--- response: 401 in 44 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b57afff6-a099-4f85-a0d8-4aa91a14cc9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b57afff6-a099-4f85-a0d8-4aa91a14cc9c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6a2be61d-63a2-42fb-a3fd-238891f4fa21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a2be61d-63a2-42fb-a3fd-238891f4fa21
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6a2be61d-63a2-42fb-a3fd-238891f4fa21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7c802229-e011-4eb3-9148-1f9f55798f11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c802229-e011-4eb3-9148-1f9f55798f11
Content-Type: application/json

--- request body ---
{"handle":"qa-414842580430","password":"****"}

--- response: 401 in 32 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c802229-e011-4eb3-9148-1f9f55798f11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c802229-e011-4eb3-9148-1f9f55798f11"}
```
