# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-82ffc06e-7033-41c8-bc0b-7a6ce6db2917` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-90312cc4-9aba-4969-8d4d-a9c8eaf1c877` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-4bbfd24b-ac0c-430a-9e74-ec5c44d9bbf3` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-7e818ab0-09cf-45e6-ad10-ba4ed75212c1` |
| 5 | `POST /v1/auth/token` | 400 | 18 | `qa-7c79d4b4-27e2-42c8-9c27-3342fc8b8ead` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-d3af3b10-4415-4c10-814f-58c5a2c8809d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-58ad3eee-5e2b-49e7-9320-2202fec95b56` |
| 8 | `POST /v1/auth/token` | 401 | 52 | `qa-e3542ee6-166f-475b-b493-f9b3b9125fc7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-3ca2f1c9-4d75-4211-93f9-9df28e39bbfc` |
| 10 | `POST /v1/auth/token` | 401 | 31 | `qa-31cc55b7-c324-43d2-b4af-024cb9a40258` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-82ffc06e-7033-41c8-bc0b-7a6ce6db2917

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82ffc06e-7033-41c8-bc0b-7a6ce6db2917
Content-Type: application/json

--- request body ---
{"handle":"qa-8ea256c765f0","displayName":"QA 8ea256c765f0","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-82ffc06e-7033-41c8-bc0b-7a6ce6db2917
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-8ea256c765f0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d8465404-24d7-439d-a917-16d6a538c68f","handle":"qa-8ea256c765f0","displayName":"QA 8ea256c765f0","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.643833508Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-90312cc4-9aba-4969-8d4d-a9c8eaf1c877

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90312cc4-9aba-4969-8d4d-a9c8eaf1c877
Content-Type: application/json

--- request body ---
{"handle":"qa-4917d7b62c1b","displayName":"QA 4917d7b62c1b","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-90312cc4-9aba-4969-8d4d-a9c8eaf1c877
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Location: /v1/accounts/qa-4917d7b62c1b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b8dafd53-3443-4e3c-b94c-f3866dfdf4e4","handle":"qa-4917d7b62c1b","displayName":"QA 4917d7b62c1b","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.722158441Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4bbfd24b-ac0c-430a-9e74-ec5c44d9bbf3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bbfd24b-ac0c-430a-9e74-ec5c44d9bbf3
Content-Type: application/json

--- request body ---
{"handle":"qa-8ea256c765f0","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bbfd24b-ac0c-430a-9e74-ec5c44d9bbf3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d8465404-24d7-439d-a917-16d6a538c68f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7e818ab0-09cf-45e6-ad10-ba4ed75212c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e818ab0-09cf-45e6-ad10-ba4ed75212c1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4917d7b62c1b","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e818ab0-09cf-45e6-ad10-ba4ed75212c1
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
Location: /v1/conversations/cnv_c047d16a-bf3e-4877-88d4-984a8c791578
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c047d16a-bf3e-4877-88d4-984a8c791578","subject":"Error contract","status":"open","region":"eu","participants":["qa-8ea256c765f0","qa-4917d7b62c1b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.795148199Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7c79d4b4-27e2-42c8-9c27-3342fc8b8ead

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c79d4b4-27e2-42c8-9c27-3342fc8b8ead
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c79d4b4-27e2-42c8-9c27-3342fc8b8ead
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-7c79d4b4-27e2-42c8-9c27-3342fc8b8ead"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d3af3b10-4415-4c10-814f-58c5a2c8809d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3af3b10-4415-4c10-814f-58c5a2c8809d
Content-Type: application/json

--- request body ---
{"handle":"qa-4917d7b62c1b","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3af3b10-4415-4c10-814f-58c5a2c8809d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b8dafd53-3443-4e3c-b94c-f3866dfdf4e4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58ad3eee-5e2b-49e7-9320-2202fec95b56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58ad3eee-5e2b-49e7-9320-2202fec95b56
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58ad3eee-5e2b-49e7-9320-2202fec95b56
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
correlation: qa-e3542ee6-166f-475b-b493-f9b3b9125fc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3542ee6-166f-475b-b493-f9b3b9125fc7
Content-Type: application/json

--- request body ---
{"handle":"qa-4917d7b62c1b","password":"****"}

--- response: 401 in 52 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3542ee6-166f-475b-b493-f9b3b9125fc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e3542ee6-166f-475b-b493-f9b3b9125fc7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3ca2f1c9-4d75-4211-93f9-9df28e39bbfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ca2f1c9-4d75-4211-93f9-9df28e39bbfc
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3ca2f1c9-4d75-4211-93f9-9df28e39bbfc
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
correlation: qa-31cc55b7-c324-43d2-b4af-024cb9a40258

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31cc55b7-c324-43d2-b4af-024cb9a40258
Content-Type: application/json

--- request body ---
{"handle":"qa-8ea256c765f0","password":"****"}

--- response: 401 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31cc55b7-c324-43d2-b4af-024cb9a40258
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-31cc55b7-c324-43d2-b4af-024cb9a40258"}
```
