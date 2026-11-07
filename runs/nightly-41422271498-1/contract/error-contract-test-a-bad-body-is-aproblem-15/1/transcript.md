# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-c7034b21-877f-438c-ab84-180887e35f68` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-2316d299-8cbd-43e8-bb77-88fda996dfef` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-41fdc2c3-d11c-46fa-bc43-a311cfbf6077` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-23bcc493-ff99-4276-902a-d38f86cc2f0a` |
| 5 | `POST /v1/credits/purchases` | 400 | 14 | `qa-9554fae2-4115-4494-879e-d2236be7adeb` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-b50babbf-acc7-4976-a8e2-23e2597e5d3a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-59fbee89-0266-4a14-917b-351fb7469331` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-f57a7a8b-fd24-4611-bcce-4ce0d8c57653` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-34892b57-c460-4fd0-9360-7dc65c5acf40` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-a867c113-1b6a-4f9d-bbdb-89bc2d174a1b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c7034b21-877f-438c-ab84-180887e35f68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7034b21-877f-438c-ab84-180887e35f68
Content-Type: application/json

--- request body ---
{"handle":"qa-3c440adb88e7","displayName":"QA 3c440adb88e7","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7034b21-877f-438c-ab84-180887e35f68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 8
Location: /v1/accounts/qa-3c440adb88e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_605c3e9a-5875-4794-809d-00147ad5c3e6","handle":"qa-3c440adb88e7","displayName":"QA 3c440adb88e7","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.408523743Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2316d299-8cbd-43e8-bb77-88fda996dfef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2316d299-8cbd-43e8-bb77-88fda996dfef
Content-Type: application/json

--- request body ---
{"handle":"qa-77fb19874d0d","displayName":"QA 77fb19874d0d","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-2316d299-8cbd-43e8-bb77-88fda996dfef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 8
Location: /v1/accounts/qa-77fb19874d0d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b7ef6807-d2c9-4883-963a-dc8444e1171d","handle":"qa-77fb19874d0d","displayName":"QA 77fb19874d0d","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.456380248Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-41fdc2c3-d11c-46fa-bc43-a311cfbf6077

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41fdc2c3-d11c-46fa-bc43-a311cfbf6077
Content-Type: application/json

--- request body ---
{"handle":"qa-3c440adb88e7","password":"****"}

--- response: 200 in 34 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-41fdc2c3-d11c-46fa-bc43-a311cfbf6077
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_605c3e9a-5875-4794-809d-00147ad5c3e6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-23bcc493-ff99-4276-902a-d38f86cc2f0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23bcc493-ff99-4276-902a-d38f86cc2f0a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-77fb19874d0d","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-23bcc493-ff99-4276-902a-d38f86cc2f0a
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
Location: /v1/conversations/cnv_36716074-3197-4cad-b964-609ec278629e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_36716074-3197-4cad-b964-609ec278629e","subject":"Error contract","status":"open","region":"eu","participants":["qa-3c440adb88e7","qa-77fb19874d0d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:37.520174229Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9554fae2-4115-4494-879e-d2236be7adeb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d4bc4d88aedd4adf91d4bce8aeb0a713
X-Correlation-Id: qa-9554fae2-4115-4494-879e-d2236be7adeb
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9554fae2-4115-4494-879e-d2236be7adeb
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-9554fae2-4115-4494-879e-d2236be7adeb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b50babbf-acc7-4976-a8e2-23e2597e5d3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b50babbf-acc7-4976-a8e2-23e2597e5d3a
Content-Type: application/json

--- request body ---
{"handle":"qa-77fb19874d0d","password":"****"}

--- response: 200 in 41 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b50babbf-acc7-4976-a8e2-23e2597e5d3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b7ef6807-d2c9-4883-963a-dc8444e1171d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-59fbee89-0266-4a14-917b-351fb7469331

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59fbee89-0266-4a14-917b-351fb7469331
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-59fbee89-0266-4a14-917b-351fb7469331
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
correlation: qa-f57a7a8b-fd24-4611-bcce-4ce0d8c57653

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f57a7a8b-fd24-4611-bcce-4ce0d8c57653
Content-Type: application/json

--- request body ---
{"handle":"qa-77fb19874d0d","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f57a7a8b-fd24-4611-bcce-4ce0d8c57653
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f57a7a8b-fd24-4611-bcce-4ce0d8c57653"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-34892b57-c460-4fd0-9360-7dc65c5acf40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34892b57-c460-4fd0-9360-7dc65c5acf40
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-34892b57-c460-4fd0-9360-7dc65c5acf40
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
correlation: qa-a867c113-1b6a-4f9d-bbdb-89bc2d174a1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a867c113-1b6a-4f9d-bbdb-89bc2d174a1b
Content-Type: application/json

--- request body ---
{"handle":"qa-3c440adb88e7","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a867c113-1b6a-4f9d-bbdb-89bc2d174a1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a867c113-1b6a-4f9d-bbdb-89bc2d174a1b"}
```
