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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-37ef2baf-05e8-4d22-8666-78419a566dda` |
| 2 | `POST /v1/accounts` | 201 | 8 | `qa-e795c8be-933f-4ece-bb34-f97a8dddf740` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-c435bdb1-491b-4a85-afd2-536c18317701` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-3e4968de-f41c-49fd-8b91-a352f213d43a` |
| 5 | `POST /v1/conversations` | 415 | 13 | `qa-4c8305e0-34a0-489a-baf8-2c7af9dc22c5` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-3bdb54d9-59a6-4d0b-b257-fda01423ff74` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-d4a3538a-2e8a-4bb1-b076-a5f9d8c770ed` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-b2d88539-ac67-4333-9755-da0dcc2dbfd5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-d9be18a0-5b53-4bd4-885d-e07071126603` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-6a2a2fd5-6f63-429e-acbb-75cbe0332e06` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-37ef2baf-05e8-4d22-8666-78419a566dda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37ef2baf-05e8-4d22-8666-78419a566dda
Content-Type: application/json

--- request body ---
{"handle":"qa-ee0bd8d0b2b6","displayName":"QA ee0bd8d0b2b6","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-37ef2baf-05e8-4d22-8666-78419a566dda
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Location: /v1/accounts/qa-ee0bd8d0b2b6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5c939609-85c9-467a-8335-11a9be537541","handle":"qa-ee0bd8d0b2b6","displayName":"QA ee0bd8d0b2b6","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.088320115Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e795c8be-933f-4ece-bb34-f97a8dddf740

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e795c8be-933f-4ece-bb34-f97a8dddf740
Content-Type: application/json

--- request body ---
{"handle":"qa-53b913deba33","displayName":"QA 53b913deba33","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e795c8be-933f-4ece-bb34-f97a8dddf740
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Location: /v1/accounts/qa-53b913deba33
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f65b0b6d-c092-4ec5-8142-4580ec489aa2","handle":"qa-53b913deba33","displayName":"QA 53b913deba33","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.155254016Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c435bdb1-491b-4a85-afd2-536c18317701

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c435bdb1-491b-4a85-afd2-536c18317701
Content-Type: application/json

--- request body ---
{"handle":"qa-ee0bd8d0b2b6","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c435bdb1-491b-4a85-afd2-536c18317701
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5c939609-85c9-467a-8335-11a9be537541"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3e4968de-f41c-49fd-8b91-a352f213d43a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e4968de-f41c-49fd-8b91-a352f213d43a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-53b913deba33","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e4968de-f41c-49fd-8b91-a352f213d43a
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
Location: /v1/conversations/cnv_c22dfcb7-6579-4361-8eb1-0f7549bb6dcc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c22dfcb7-6579-4361-8eb1-0f7549bb6dcc","subject":"Error contract","status":"open","region":"eu","participants":["qa-ee0bd8d0b2b6","qa-53b913deba33"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.194729579Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-4c8305e0-34a0-489a-baf8-2c7af9dc22c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c8305e0-34a0-489a-baf8-2c7af9dc22c5
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c8305e0-34a0-489a-baf8-2c7af9dc22c5
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-4c8305e0-34a0-489a-baf8-2c7af9dc22c5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3bdb54d9-59a6-4d0b-b257-fda01423ff74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bdb54d9-59a6-4d0b-b257-fda01423ff74
Content-Type: application/json

--- request body ---
{"handle":"qa-53b913deba33","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bdb54d9-59a6-4d0b-b257-fda01423ff74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f65b0b6d-c092-4ec5-8142-4580ec489aa2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d4a3538a-2e8a-4bb1-b076-a5f9d8c770ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4a3538a-2e8a-4bb1-b076-a5f9d8c770ed
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d4a3538a-2e8a-4bb1-b076-a5f9d8c770ed
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
correlation: qa-b2d88539-ac67-4333-9755-da0dcc2dbfd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2d88539-ac67-4333-9755-da0dcc2dbfd5
Content-Type: application/json

--- request body ---
{"handle":"qa-53b913deba33","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2d88539-ac67-4333-9755-da0dcc2dbfd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b2d88539-ac67-4333-9755-da0dcc2dbfd5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d9be18a0-5b53-4bd4-885d-e07071126603

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9be18a0-5b53-4bd4-885d-e07071126603
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d9be18a0-5b53-4bd4-885d-e07071126603
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
correlation: qa-6a2a2fd5-6f63-429e-acbb-75cbe0332e06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a2a2fd5-6f63-429e-acbb-75cbe0332e06
Content-Type: application/json

--- request body ---
{"handle":"qa-ee0bd8d0b2b6","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a2a2fd5-6f63-429e-acbb-75cbe0332e06
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6a2a2fd5-6f63-429e-acbb-75cbe0332e06"}
```
