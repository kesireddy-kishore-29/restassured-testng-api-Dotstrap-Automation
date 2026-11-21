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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-aa068a26-1db5-4510-9770-cdd54e895821` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-dfb40e2b-face-4ba1-9b74-25f9270eaebd` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-69f62ae4-4662-45c3-aa24-d393b8e82717` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-0823f982-7a61-4ae1-9cf9-5e6ace3233c4` |
| 5 | `POST /v1/conversations` | 415 | 13 | `qa-00147d5f-9472-4fa4-b320-5740f682df82` |
| 6 | `POST /v1/auth/token` | 200 | 52 | `qa-a44a8feb-7275-43ed-8b2c-2d3e7adc42e9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-55d75661-53e9-4d00-a3e3-dc19714841d0` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-db9a2c5f-63d6-430b-9d54-34f1a13e5fbd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-ed4f43e7-6e2c-42f0-a865-2664083bab88` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-1b74f406-f568-4098-84d2-e6dedb05bf38` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aa068a26-1db5-4510-9770-cdd54e895821

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa068a26-1db5-4510-9770-cdd54e895821
Content-Type: application/json

--- request body ---
{"handle":"qa-a50e4ed32b90","displayName":"QA a50e4ed32b90","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa068a26-1db5-4510-9770-cdd54e895821
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Location: /v1/accounts/qa-a50e4ed32b90
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e52726bb-243f-4871-9861-bc2cdf56f6bc","handle":"qa-a50e4ed32b90","displayName":"QA a50e4ed32b90","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.649085361Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dfb40e2b-face-4ba1-9b74-25f9270eaebd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfb40e2b-face-4ba1-9b74-25f9270eaebd
Content-Type: application/json

--- request body ---
{"handle":"qa-fd030d97574e","displayName":"QA fd030d97574e","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfb40e2b-face-4ba1-9b74-25f9270eaebd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Location: /v1/accounts/qa-fd030d97574e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d46a320c-9a23-4678-ae12-4119d62f0b81","handle":"qa-fd030d97574e","displayName":"QA fd030d97574e","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.712380527Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-69f62ae4-4662-45c3-aa24-d393b8e82717

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69f62ae4-4662-45c3-aa24-d393b8e82717
Content-Type: application/json

--- request body ---
{"handle":"qa-a50e4ed32b90","password":"****"}

--- response: 200 in 50 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-69f62ae4-4662-45c3-aa24-d393b8e82717
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e52726bb-243f-4871-9861-bc2cdf56f6bc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0823f982-7a61-4ae1-9cf9-5e6ace3233c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0823f982-7a61-4ae1-9cf9-5e6ace3233c4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fd030d97574e","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0823f982-7a61-4ae1-9cf9-5e6ace3233c4
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
Location: /v1/conversations/cnv_3153df8b-ebfb-4043-8755-442c703307d2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3153df8b-ebfb-4043-8755-442c703307d2","subject":"Error contract","status":"open","region":"eu","participants":["qa-a50e4ed32b90","qa-fd030d97574e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.833592255Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-00147d5f-9472-4fa4-b320-5740f682df82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00147d5f-9472-4fa4-b320-5740f682df82
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00147d5f-9472-4fa4-b320-5740f682df82
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-00147d5f-9472-4fa4-b320-5740f682df82"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a44a8feb-7275-43ed-8b2c-2d3e7adc42e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a44a8feb-7275-43ed-8b2c-2d3e7adc42e9
Content-Type: application/json

--- request body ---
{"handle":"qa-fd030d97574e","password":"****"}

--- response: 200 in 52 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-a44a8feb-7275-43ed-8b2c-2d3e7adc42e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d46a320c-9a23-4678-ae12-4119d62f0b81"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-55d75661-53e9-4d00-a3e3-dc19714841d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55d75661-53e9-4d00-a3e3-dc19714841d0
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-55d75661-53e9-4d00-a3e3-dc19714841d0
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
correlation: qa-db9a2c5f-63d6-430b-9d54-34f1a13e5fbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db9a2c5f-63d6-430b-9d54-34f1a13e5fbd
Content-Type: application/json

--- request body ---
{"handle":"qa-fd030d97574e","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db9a2c5f-63d6-430b-9d54-34f1a13e5fbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db9a2c5f-63d6-430b-9d54-34f1a13e5fbd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ed4f43e7-6e2c-42f0-a865-2664083bab88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed4f43e7-6e2c-42f0-a865-2664083bab88
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ed4f43e7-6e2c-42f0-a865-2664083bab88
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
correlation: qa-1b74f406-f568-4098-84d2-e6dedb05bf38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b74f406-f568-4098-84d2-e6dedb05bf38
Content-Type: application/json

--- request body ---
{"handle":"qa-a50e4ed32b90","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b74f406-f568-4098-84d2-e6dedb05bf38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1b74f406-f568-4098-84d2-e6dedb05bf38"}
```
