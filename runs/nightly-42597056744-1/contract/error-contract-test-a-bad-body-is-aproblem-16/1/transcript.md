# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-11e4ca5a-cb51-4ac4-97df-0e209020c84e` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-25f4800e-832f-4e31-b7dd-98b0580a32fa` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-d63bcc3e-05b0-44a5-a030-28d2eda772ce` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-39c976b9-d71e-4a0d-a3b6-76a4dd5ac709` |
| 5 | `POST /v1/credits/purchases` | 415 | 8 | `qa-32b854f5-daea-44c3-a608-64e0ff1dc1e1` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-b9a51f3a-33d5-4802-8697-114d703233cb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-8e158f12-716b-4c66-9b01-1b3bdc7f3839` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-29b1f649-23fd-4e3f-99dc-1b8b3c9c095e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-040ca374-0667-4b32-aee3-d507cef48fda` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-68783f5f-9f31-4c95-8413-6827ae9c697b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-11e4ca5a-cb51-4ac4-97df-0e209020c84e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11e4ca5a-cb51-4ac4-97df-0e209020c84e
Content-Type: application/json

--- request body ---
{"handle":"qa-767322d13d2d","displayName":"QA 767322d13d2d","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-11e4ca5a-cb51-4ac4-97df-0e209020c84e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 8
Location: /v1/accounts/qa-767322d13d2d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fcf1d94b-5ae6-4c2f-9a51-2ce4a011551c","handle":"qa-767322d13d2d","displayName":"QA 767322d13d2d","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.892294031Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-25f4800e-832f-4e31-b7dd-98b0580a32fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25f4800e-832f-4e31-b7dd-98b0580a32fa
Content-Type: application/json

--- request body ---
{"handle":"qa-c88f91d176be","displayName":"QA c88f91d176be","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-25f4800e-832f-4e31-b7dd-98b0580a32fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 8
Location: /v1/accounts/qa-c88f91d176be
X-Served-Region: eu
Content-Length: 181

{"id":"acc_57fe42b2-ebf4-4d84-a6dd-20b006b86d26","handle":"qa-c88f91d176be","displayName":"QA c88f91d176be","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.923199778Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d63bcc3e-05b0-44a5-a030-28d2eda772ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d63bcc3e-05b0-44a5-a030-28d2eda772ce
Content-Type: application/json

--- request body ---
{"handle":"qa-767322d13d2d","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d63bcc3e-05b0-44a5-a030-28d2eda772ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fcf1d94b-5ae6-4c2f-9a51-2ce4a011551c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-39c976b9-d71e-4a0d-a3b6-76a4dd5ac709

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39c976b9-d71e-4a0d-a3b6-76a4dd5ac709
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c88f91d176be","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-39c976b9-d71e-4a0d-a3b6-76a4dd5ac709
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
Location: /v1/conversations/cnv_737a03c5-197f-4b09-8093-e9029927afb8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_737a03c5-197f-4b09-8093-e9029927afb8","subject":"Error contract","status":"open","region":"eu","participants":["qa-767322d13d2d","qa-c88f91d176be"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.981641181Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-32b854f5-daea-44c3-a608-64e0ff1dc1e1

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fd8b3397520d4e719eb57c8abd1b7a04
X-Correlation-Id: qa-32b854f5-daea-44c3-a608-64e0ff1dc1e1
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32b854f5-daea-44c3-a608-64e0ff1dc1e1
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-32b854f5-daea-44c3-a608-64e0ff1dc1e1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b9a51f3a-33d5-4802-8697-114d703233cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9a51f3a-33d5-4802-8697-114d703233cb
Content-Type: application/json

--- request body ---
{"handle":"qa-c88f91d176be","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9a51f3a-33d5-4802-8697-114d703233cb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_57fe42b2-ebf4-4d84-a6dd-20b006b86d26"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e158f12-716b-4c66-9b01-1b3bdc7f3839

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e158f12-716b-4c66-9b01-1b3bdc7f3839
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e158f12-716b-4c66-9b01-1b3bdc7f3839
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
correlation: qa-29b1f649-23fd-4e3f-99dc-1b8b3c9c095e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29b1f649-23fd-4e3f-99dc-1b8b3c9c095e
Content-Type: application/json

--- request body ---
{"handle":"qa-c88f91d176be","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29b1f649-23fd-4e3f-99dc-1b8b3c9c095e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-29b1f649-23fd-4e3f-99dc-1b8b3c9c095e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-040ca374-0667-4b32-aee3-d507cef48fda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-040ca374-0667-4b32-aee3-d507cef48fda
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-040ca374-0667-4b32-aee3-d507cef48fda
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
correlation: qa-68783f5f-9f31-4c95-8413-6827ae9c697b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68783f5f-9f31-4c95-8413-6827ae9c697b
Content-Type: application/json

--- request body ---
{"handle":"qa-767322d13d2d","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68783f5f-9f31-4c95-8413-6827ae9c697b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-68783f5f-9f31-4c95-8413-6827ae9c697b"}
```
