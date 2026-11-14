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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-bd0e88be-5b17-4b08-a84a-0eee22ffaf1d` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-0b7032cb-5abd-4990-9b7c-f81a12e2eec8` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-9a46869e-7f6b-4943-a8d1-584a46958acf` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-7ee2de96-a98d-4466-8196-88e3876ca369` |
| 5 | `POST /v1/credits/purchases` | 415 | 10 | `qa-0601bd86-5ffa-49d9-9eff-4df65c0cdefa` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-26733549-1072-4142-9afe-ab46843e2f83` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-c337ebf9-0e43-4f7b-8303-9dbac7eeb24a` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-3ad7eee9-e971-4767-aed5-c6c88b39c7da` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-3a2e676d-a40f-4fa5-8332-0e0b8fd83e72` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-310cf74b-b717-4d8b-a58a-c38ae4413716` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bd0e88be-5b17-4b08-a84a-0eee22ffaf1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd0e88be-5b17-4b08-a84a-0eee22ffaf1d
Content-Type: application/json

--- request body ---
{"handle":"qa-60a64c731e3b","displayName":"QA 60a64c731e3b","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd0e88be-5b17-4b08-a84a-0eee22ffaf1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 6
Location: /v1/accounts/qa-60a64c731e3b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3314488d-01df-43d1-97d1-3a556fe2e4fa","handle":"qa-60a64c731e3b","displayName":"QA 60a64c731e3b","region":"eu","role":"user","createdAt":"2026-11-05T09:37:57.061869455Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0b7032cb-5abd-4990-9b7c-f81a12e2eec8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b7032cb-5abd-4990-9b7c-f81a12e2eec8
Content-Type: application/json

--- request body ---
{"handle":"qa-0bcc5c6417c5","displayName":"QA 0bcc5c6417c5","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b7032cb-5abd-4990-9b7c-f81a12e2eec8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 6
Location: /v1/accounts/qa-0bcc5c6417c5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e87ef68e-14d5-4d0f-9184-6797cfd74f90","handle":"qa-0bcc5c6417c5","displayName":"QA 0bcc5c6417c5","region":"eu","role":"user","createdAt":"2026-11-05T09:37:57.106527525Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9a46869e-7f6b-4943-a8d1-584a46958acf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a46869e-7f6b-4943-a8d1-584a46958acf
Content-Type: application/json

--- request body ---
{"handle":"qa-60a64c731e3b","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a46869e-7f6b-4943-a8d1-584a46958acf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3314488d-01df-43d1-97d1-3a556fe2e4fa"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7ee2de96-a98d-4466-8196-88e3876ca369

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ee2de96-a98d-4466-8196-88e3876ca369
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0bcc5c6417c5","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ee2de96-a98d-4466-8196-88e3876ca369
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
Location: /v1/conversations/cnv_1342fd4c-aefc-40da-a60f-8e1e92524e7b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1342fd4c-aefc-40da-a60f-8e1e92524e7b","subject":"Error contract","status":"open","region":"eu","participants":["qa-60a64c731e3b","qa-0bcc5c6417c5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:57.174500031Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0601bd86-5ffa-49d9-9eff-4df65c0cdefa

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6a1802438c2e4381b0741fb1d3500421
X-Correlation-Id: qa-0601bd86-5ffa-49d9-9eff-4df65c0cdefa
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0601bd86-5ffa-49d9-9eff-4df65c0cdefa
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-0601bd86-5ffa-49d9-9eff-4df65c0cdefa"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-26733549-1072-4142-9afe-ab46843e2f83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26733549-1072-4142-9afe-ab46843e2f83
Content-Type: application/json

--- request body ---
{"handle":"qa-0bcc5c6417c5","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-26733549-1072-4142-9afe-ab46843e2f83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e87ef68e-14d5-4d0f-9184-6797cfd74f90"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c337ebf9-0e43-4f7b-8303-9dbac7eeb24a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c337ebf9-0e43-4f7b-8303-9dbac7eeb24a
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c337ebf9-0e43-4f7b-8303-9dbac7eeb24a
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
correlation: qa-3ad7eee9-e971-4767-aed5-c6c88b39c7da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ad7eee9-e971-4767-aed5-c6c88b39c7da
Content-Type: application/json

--- request body ---
{"handle":"qa-0bcc5c6417c5","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ad7eee9-e971-4767-aed5-c6c88b39c7da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3ad7eee9-e971-4767-aed5-c6c88b39c7da"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3a2e676d-a40f-4fa5-8332-0e0b8fd83e72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a2e676d-a40f-4fa5-8332-0e0b8fd83e72
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3a2e676d-a40f-4fa5-8332-0e0b8fd83e72
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
correlation: qa-310cf74b-b717-4d8b-a58a-c38ae4413716

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-310cf74b-b717-4d8b-a58a-c38ae4413716
Content-Type: application/json

--- request body ---
{"handle":"qa-60a64c731e3b","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-310cf74b-b717-4d8b-a58a-c38ae4413716
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-310cf74b-b717-4d8b-a58a-c38ae4413716"}
```
