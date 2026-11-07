# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 54 | `qa-214e2ef6-e2b8-443b-861f-df8cc1224edb` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-7fc4cc95-5668-4244-b373-c1b677b491c2` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-241131f9-16d3-4520-9032-91de28aa2708` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-71b1ca63-19e9-4304-aefe-e682ee7f6eb0` |
| 5 | `POST /v1/accounts` | 415 | 21 | `qa-8ae12c0a-49df-495d-8d79-d86b64277dd3` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-55d8b38a-6ffd-4d88-b9f9-b256e53a9160` |
| 7 | `DELETE /v1/accounts/me` | 204 | 42 | `qa-eaf941b1-3347-40b8-999c-db35eff7833e` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-d7e1eae0-183c-42e6-a7a2-bcda50a83c21` |
| 9 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-b831f761-61fd-4022-83f1-f97a89c9663a` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-cd34b42f-74d0-4b78-b877-9779c126fde2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-214e2ef6-e2b8-443b-861f-df8cc1224edb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-214e2ef6-e2b8-443b-861f-df8cc1224edb
Content-Type: application/json

--- request body ---
{"handle":"qa-74815e1dec66","displayName":"QA 74815e1dec66","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-214e2ef6-e2b8-443b-861f-df8cc1224edb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 9
Location: /v1/accounts/qa-74815e1dec66
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1ac9b5d6-aa1a-4d29-ac04-714359e7f409","handle":"qa-74815e1dec66","displayName":"QA 74815e1dec66","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.280032782Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7fc4cc95-5668-4244-b373-c1b677b491c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fc4cc95-5668-4244-b373-c1b677b491c2
Content-Type: application/json

--- request body ---
{"handle":"qa-e3784e992082","displayName":"QA e3784e992082","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fc4cc95-5668-4244-b373-c1b677b491c2
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
Location: /v1/accounts/qa-e3784e992082
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d584e22-46df-445f-8caa-02a8beb00eff","handle":"qa-e3784e992082","displayName":"QA e3784e992082","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.354986084Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-241131f9-16d3-4520-9032-91de28aa2708

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-241131f9-16d3-4520-9032-91de28aa2708
Content-Type: application/json

--- request body ---
{"handle":"qa-74815e1dec66","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-241131f9-16d3-4520-9032-91de28aa2708
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1ac9b5d6-aa1a-4d29-ac04-714359e7f409"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-71b1ca63-19e9-4304-aefe-e682ee7f6eb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71b1ca63-19e9-4304-aefe-e682ee7f6eb0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e3784e992082","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-71b1ca63-19e9-4304-aefe-e682ee7f6eb0
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
Location: /v1/conversations/cnv_9c9e91b7-e82f-4621-afb9-ac7b94615002
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9c9e91b7-e82f-4621-afb9-ac7b94615002","subject":"Error contract","status":"open","region":"eu","participants":["qa-74815e1dec66","qa-e3784e992082"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:22.439786629Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-8ae12c0a-49df-495d-8d79-d86b64277dd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ae12c0a-49df-495d-8d79-d86b64277dd3
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ae12c0a-49df-495d-8d79-d86b64277dd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-8ae12c0a-49df-495d-8d79-d86b64277dd3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-55d8b38a-6ffd-4d88-b9f9-b256e53a9160

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55d8b38a-6ffd-4d88-b9f9-b256e53a9160
Content-Type: application/json

--- request body ---
{"handle":"qa-e3784e992082","password":"****"}

--- response: 200 in 45 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-55d8b38a-6ffd-4d88-b9f9-b256e53a9160
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d584e22-46df-445f-8caa-02a8beb00eff"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eaf941b1-3347-40b8-999c-db35eff7833e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaf941b1-3347-40b8-999c-db35eff7833e
Content-Type: application/json

--- response: 204 in 42 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eaf941b1-3347-40b8-999c-db35eff7833e
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
correlation: qa-d7e1eae0-183c-42e6-a7a2-bcda50a83c21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7e1eae0-183c-42e6-a7a2-bcda50a83c21
Content-Type: application/json

--- request body ---
{"handle":"qa-e3784e992082","password":"****"}

--- response: 401 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7e1eae0-183c-42e6-a7a2-bcda50a83c21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d7e1eae0-183c-42e6-a7a2-bcda50a83c21"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b831f761-61fd-4022-83f1-f97a89c9663a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b831f761-61fd-4022-83f1-f97a89c9663a
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b831f761-61fd-4022-83f1-f97a89c9663a
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
correlation: qa-cd34b42f-74d0-4b78-b877-9779c126fde2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd34b42f-74d0-4b78-b877-9779c126fde2
Content-Type: application/json

--- request body ---
{"handle":"qa-74815e1dec66","password":"****"}

--- response: 401 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd34b42f-74d0-4b78-b877-9779c126fde2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cd34b42f-74d0-4b78-b877-9779c126fde2"}
```
