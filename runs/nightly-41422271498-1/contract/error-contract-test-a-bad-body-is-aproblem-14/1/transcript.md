# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-8b416a37-0180-42dd-814f-89cf846d2585` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-a223aede-b79a-4bfe-9e39-add04470bde7` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-86b62fc7-2736-4273-a7e7-6b94c045213e` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-d98d444c-3438-4acf-ac93-749ef547e783` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 16 | `qa-34628ec7-3a61-4535-8d02-cf7d5484ceb4` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-309219c5-07b7-45a7-9117-d795eb7bc50d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-00fb89ba-dc15-4187-a94e-8874b3c3c8a0` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-8383d76c-c9ae-401c-aebc-be43a9262008` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-f7aeae53-221f-491a-bbc1-08daabc4d067` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-aa1743d5-215c-4adf-85a6-0e4160a66e19` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8b416a37-0180-42dd-814f-89cf846d2585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b416a37-0180-42dd-814f-89cf846d2585
Content-Type: application/json

--- request body ---
{"handle":"qa-e9db9880fd22","displayName":"QA e9db9880fd22","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b416a37-0180-42dd-814f-89cf846d2585
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Location: /v1/accounts/qa-e9db9880fd22
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54e35213-c67a-4482-8ea7-741c264cac7a","handle":"qa-e9db9880fd22","displayName":"QA e9db9880fd22","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.237857392Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a223aede-b79a-4bfe-9e39-add04470bde7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a223aede-b79a-4bfe-9e39-add04470bde7
Content-Type: application/json

--- request body ---
{"handle":"qa-f00b2d225218","displayName":"QA f00b2d225218","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a223aede-b79a-4bfe-9e39-add04470bde7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 8
Location: /v1/accounts/qa-f00b2d225218
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b0cd6b6-36f4-4831-8420-d31fe062d44e","handle":"qa-f00b2d225218","displayName":"QA f00b2d225218","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.267342601Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-86b62fc7-2736-4273-a7e7-6b94c045213e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86b62fc7-2736-4273-a7e7-6b94c045213e
Content-Type: application/json

--- request body ---
{"handle":"qa-e9db9880fd22","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-86b62fc7-2736-4273-a7e7-6b94c045213e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54e35213-c67a-4482-8ea7-741c264cac7a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d98d444c-3438-4acf-ac93-749ef547e783

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d98d444c-3438-4acf-ac93-749ef547e783
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f00b2d225218","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d98d444c-3438-4acf-ac93-749ef547e783
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
Location: /v1/conversations/cnv_7e7de090-acf7-4244-a353-bfd4c6909218
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7e7de090-acf7-4244-a353-bfd4c6909218","subject":"Error contract","status":"open","region":"eu","participants":["qa-e9db9880fd22","qa-f00b2d225218"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:37.334292208Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_7e7de090-acf7-4244-a353-bfd4c6909218/messages
correlation: qa-34628ec7-3a61-4535-8d02-cf7d5484ceb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34628ec7-3a61-4535-8d02-cf7d5484ceb4
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34628ec7-3a61-4535-8d02-cf7d5484ceb4
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_7e7de090-acf7-4244-a353-bfd4c6909218/messages","correlationId":"qa-34628ec7-3a61-4535-8d02-cf7d5484ceb4","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-309219c5-07b7-45a7-9117-d795eb7bc50d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-309219c5-07b7-45a7-9117-d795eb7bc50d
Content-Type: application/json

--- request body ---
{"handle":"qa-f00b2d225218","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-309219c5-07b7-45a7-9117-d795eb7bc50d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b0cd6b6-36f4-4831-8420-d31fe062d44e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-00fb89ba-dc15-4187-a94e-8874b3c3c8a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00fb89ba-dc15-4187-a94e-8874b3c3c8a0
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-00fb89ba-dc15-4187-a94e-8874b3c3c8a0
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
correlation: qa-8383d76c-c9ae-401c-aebc-be43a9262008

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8383d76c-c9ae-401c-aebc-be43a9262008
Content-Type: application/json

--- request body ---
{"handle":"qa-f00b2d225218","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8383d76c-c9ae-401c-aebc-be43a9262008
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8383d76c-c9ae-401c-aebc-be43a9262008"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f7aeae53-221f-491a-bbc1-08daabc4d067

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7aeae53-221f-491a-bbc1-08daabc4d067
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f7aeae53-221f-491a-bbc1-08daabc4d067
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
correlation: qa-aa1743d5-215c-4adf-85a6-0e4160a66e19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa1743d5-215c-4adf-85a6-0e4160a66e19
Content-Type: application/json

--- request body ---
{"handle":"qa-e9db9880fd22","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa1743d5-215c-4adf-85a6-0e4160a66e19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa1743d5-215c-4adf-85a6-0e4160a66e19"}
```
