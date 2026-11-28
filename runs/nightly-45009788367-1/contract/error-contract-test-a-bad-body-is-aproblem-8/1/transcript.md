# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-25076802-88f8-4227-8a1a-3d4c4dee32da` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-7ef4240f-ac95-42ab-a901-71df32353642` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-0c588f9d-0963-4f1d-8dd6-def1589adca6` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-f898db41-8b4e-43fb-a24b-cae333986beb` |
| 5 | `PATCH /v1/accounts/me` | 422 | 19 | `qa-a2fa465d-8d18-42eb-9dbd-71907440ce20` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-af414e9e-5da7-4486-9aa5-4cd4ce36d6fe` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-2bc011bb-83cd-4806-83b4-c06ba70b54ee` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-ffd9fc2e-a7f7-4f08-9d50-5a6502c41435` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-191749b9-b2e6-4f3a-a9ee-a4fa8bb79385` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-a567a898-4e01-4209-8234-bb7d4ab8be2b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-25076802-88f8-4227-8a1a-3d4c4dee32da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25076802-88f8-4227-8a1a-3d4c4dee32da
Content-Type: application/json

--- request body ---
{"handle":"qa-248b29df0641","displayName":"QA 248b29df0641","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-25076802-88f8-4227-8a1a-3d4c4dee32da
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
Location: /v1/accounts/qa-248b29df0641
X-Served-Region: eu
Content-Length: 181

{"id":"acc_abe991dd-f227-4251-9ee0-1e1c820408c5","handle":"qa-248b29df0641","displayName":"QA 248b29df0641","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.667399193Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7ef4240f-ac95-42ab-a901-71df32353642

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ef4240f-ac95-42ab-a901-71df32353642
Content-Type: application/json

--- request body ---
{"handle":"qa-75254ba55c16","displayName":"QA 75254ba55c16","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ef4240f-ac95-42ab-a901-71df32353642
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Location: /v1/accounts/qa-75254ba55c16
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8763d625-ef9a-4135-921d-a8ef7f4b2b2e","handle":"qa-75254ba55c16","displayName":"QA 75254ba55c16","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.688020262Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0c588f9d-0963-4f1d-8dd6-def1589adca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c588f9d-0963-4f1d-8dd6-def1589adca6
Content-Type: application/json

--- request body ---
{"handle":"qa-248b29df0641","password":"****"}

--- response: 200 in 34 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c588f9d-0963-4f1d-8dd6-def1589adca6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_abe991dd-f227-4251-9ee0-1e1c820408c5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f898db41-8b4e-43fb-a24b-cae333986beb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f898db41-8b4e-43fb-a24b-cae333986beb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-75254ba55c16","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-f898db41-8b4e-43fb-a24b-cae333986beb
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
Location: /v1/conversations/cnv_5a35e1f9-7a69-4797-919d-229dd1d3a408
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5a35e1f9-7a69-4797-919d-229dd1d3a408","subject":"Error contract","status":"open","region":"eu","participants":["qa-248b29df0641","qa-75254ba55c16"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.760801853Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-a2fa465d-8d18-42eb-9dbd-71907440ce20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2fa465d-8d18-42eb-9dbd-71907440ce20
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2fa465d-8d18-42eb-9dbd-71907440ce20
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-a2fa465d-8d18-42eb-9dbd-71907440ce20","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-af414e9e-5da7-4486-9aa5-4cd4ce36d6fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af414e9e-5da7-4486-9aa5-4cd4ce36d6fe
Content-Type: application/json

--- request body ---
{"handle":"qa-75254ba55c16","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-af414e9e-5da7-4486-9aa5-4cd4ce36d6fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8763d625-ef9a-4135-921d-a8ef7f4b2b2e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2bc011bb-83cd-4806-83b4-c06ba70b54ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bc011bb-83cd-4806-83b4-c06ba70b54ee
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2bc011bb-83cd-4806-83b4-c06ba70b54ee
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
correlation: qa-ffd9fc2e-a7f7-4f08-9d50-5a6502c41435

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffd9fc2e-a7f7-4f08-9d50-5a6502c41435
Content-Type: application/json

--- request body ---
{"handle":"qa-75254ba55c16","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ffd9fc2e-a7f7-4f08-9d50-5a6502c41435
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ffd9fc2e-a7f7-4f08-9d50-5a6502c41435"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-191749b9-b2e6-4f3a-a9ee-a4fa8bb79385

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-191749b9-b2e6-4f3a-a9ee-a4fa8bb79385
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-191749b9-b2e6-4f3a-a9ee-a4fa8bb79385
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
correlation: qa-a567a898-4e01-4209-8234-bb7d4ab8be2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a567a898-4e01-4209-8234-bb7d4ab8be2b
Content-Type: application/json

--- request body ---
{"handle":"qa-248b29df0641","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a567a898-4e01-4209-8234-bb7d4ab8be2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a567a898-4e01-4209-8234-bb7d4ab8be2b"}
```
