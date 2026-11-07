# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-cc822953-477d-4bfb-ab81-caf0db7b797d` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-250be410-dbc4-45ee-9da6-487e798532b0` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-45105958-0d4a-4a5a-9c89-a96c45d1a059` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-c121b2b6-eb05-412e-b9fc-79bee8ff913f` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 13 | `qa-7a071025-34c2-4ca8-b320-3fda8317f5fe` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-55e7e5d6-8052-423f-b10b-07a6b107f2a9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-5b6890c7-511d-4f00-abee-0e76f275b312` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-8acaa710-fea5-4c90-8018-155e5c26b1ce` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-373e8e4b-2718-4a63-ac56-fd8a60d086a5` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-4947fdf0-f86e-4a5e-90ad-0e68822fdaa6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cc822953-477d-4bfb-ab81-caf0db7b797d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc822953-477d-4bfb-ab81-caf0db7b797d
Content-Type: application/json

--- request body ---
{"handle":"qa-698e9b01e654","displayName":"QA 698e9b01e654","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc822953-477d-4bfb-ab81-caf0db7b797d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Location: /v1/accounts/qa-698e9b01e654
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2849a011-eec4-4c31-aceb-ea0aa1b3fb63","handle":"qa-698e9b01e654","displayName":"QA 698e9b01e654","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.472617308Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-250be410-dbc4-45ee-9da6-487e798532b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-250be410-dbc4-45ee-9da6-487e798532b0
Content-Type: application/json

--- request body ---
{"handle":"qa-31d2c66fe6c2","displayName":"QA 31d2c66fe6c2","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-250be410-dbc4-45ee-9da6-487e798532b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 7
Location: /v1/accounts/qa-31d2c66fe6c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cf13faf9-7b7e-4935-8182-47a15152e4f2","handle":"qa-31d2c66fe6c2","displayName":"QA 31d2c66fe6c2","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.515780239Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-45105958-0d4a-4a5a-9c89-a96c45d1a059

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45105958-0d4a-4a5a-9c89-a96c45d1a059
Content-Type: application/json

--- request body ---
{"handle":"qa-698e9b01e654","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-45105958-0d4a-4a5a-9c89-a96c45d1a059
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2849a011-eec4-4c31-aceb-ea0aa1b3fb63"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c121b2b6-eb05-412e-b9fc-79bee8ff913f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c121b2b6-eb05-412e-b9fc-79bee8ff913f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-31d2c66fe6c2","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c121b2b6-eb05-412e-b9fc-79bee8ff913f
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
Location: /v1/conversations/cnv_81e40bcf-84fd-4a30-bd9f-1361667656b6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_81e40bcf-84fd-4a30-bd9f-1361667656b6","subject":"Error contract","status":"open","region":"eu","participants":["qa-698e9b01e654","qa-31d2c66fe6c2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.611409176Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_81e40bcf-84fd-4a30-bd9f-1361667656b6/messages
correlation: qa-7a071025-34c2-4ca8-b320-3fda8317f5fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a071025-34c2-4ca8-b320-3fda8317f5fe
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a071025-34c2-4ca8-b320-3fda8317f5fe
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_81e40bcf-84fd-4a30-bd9f-1361667656b6/messages","correlationId":"qa-7a071025-34c2-4ca8-b320-3fda8317f5fe"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-55e7e5d6-8052-423f-b10b-07a6b107f2a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55e7e5d6-8052-423f-b10b-07a6b107f2a9
Content-Type: application/json

--- request body ---
{"handle":"qa-31d2c66fe6c2","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-55e7e5d6-8052-423f-b10b-07a6b107f2a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cf13faf9-7b7e-4935-8182-47a15152e4f2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5b6890c7-511d-4f00-abee-0e76f275b312

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b6890c7-511d-4f00-abee-0e76f275b312
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5b6890c7-511d-4f00-abee-0e76f275b312
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
correlation: qa-8acaa710-fea5-4c90-8018-155e5c26b1ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8acaa710-fea5-4c90-8018-155e5c26b1ce
Content-Type: application/json

--- request body ---
{"handle":"qa-31d2c66fe6c2","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8acaa710-fea5-4c90-8018-155e5c26b1ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8acaa710-fea5-4c90-8018-155e5c26b1ce"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-373e8e4b-2718-4a63-ac56-fd8a60d086a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-373e8e4b-2718-4a63-ac56-fd8a60d086a5
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-373e8e4b-2718-4a63-ac56-fd8a60d086a5
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
correlation: qa-4947fdf0-f86e-4a5e-90ad-0e68822fdaa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4947fdf0-f86e-4a5e-90ad-0e68822fdaa6
Content-Type: application/json

--- request body ---
{"handle":"qa-698e9b01e654","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4947fdf0-f86e-4a5e-90ad-0e68822fdaa6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4947fdf0-f86e-4a5e-90ad-0e68822fdaa6"}
```
