# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 61 | `qa-4d00dea6-faf8-4894-a581-fdc371078520` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-68c98330-d2de-45c8-9d92-a8cc635018ba` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-0f2bb90d-3826-4e34-8eed-1d7ef27ae14e` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-e43f1926-3066-48db-b245-135374a8ec3c` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 14 | `qa-317e0d05-cd45-4df1-a998-df797d9d7f3f` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-d88cf73a-2c92-485a-9dad-efb6685a797f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-d7db21e7-7f39-4eab-9db0-c35d80b7b066` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-6f6b5211-d124-4c3b-9ab6-b2c865b5ff2a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-cc02ab26-5c9d-4801-9d64-914b04dbd4d8` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-e3e48d04-f23a-462b-b13a-10aa49c3d0d8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4d00dea6-faf8-4894-a581-fdc371078520

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d00dea6-faf8-4894-a581-fdc371078520
Content-Type: application/json

--- request body ---
{"handle":"qa-0dcf5b14bcc2","displayName":"QA 0dcf5b14bcc2","password":"****","region":"eu"}

--- response: 201 in 61 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d00dea6-faf8-4894-a581-fdc371078520
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Location: /v1/accounts/qa-0dcf5b14bcc2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6d5a81c-a9ab-484e-bda0-a2e1e134284a","handle":"qa-0dcf5b14bcc2","displayName":"QA 0dcf5b14bcc2","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.259180633Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-68c98330-d2de-45c8-9d92-a8cc635018ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68c98330-d2de-45c8-9d92-a8cc635018ba
Content-Type: application/json

--- request body ---
{"handle":"qa-25cf639eafee","displayName":"QA 25cf639eafee","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-68c98330-d2de-45c8-9d92-a8cc635018ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 7
Location: /v1/accounts/qa-25cf639eafee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_76a11296-61e5-4924-b80e-8d6805db6b1e","handle":"qa-25cf639eafee","displayName":"QA 25cf639eafee","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.313935900Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0f2bb90d-3826-4e34-8eed-1d7ef27ae14e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f2bb90d-3826-4e34-8eed-1d7ef27ae14e
Content-Type: application/json

--- request body ---
{"handle":"qa-0dcf5b14bcc2","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f2bb90d-3826-4e34-8eed-1d7ef27ae14e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6d5a81c-a9ab-484e-bda0-a2e1e134284a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e43f1926-3066-48db-b245-135374a8ec3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e43f1926-3066-48db-b245-135374a8ec3c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-25cf639eafee","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e43f1926-3066-48db-b245-135374a8ec3c
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
Location: /v1/conversations/cnv_56d740a6-4b5f-4b43-8891-206b55ee8f7e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_56d740a6-4b5f-4b43-8891-206b55ee8f7e","subject":"Error contract","status":"open","region":"eu","participants":["qa-0dcf5b14bcc2","qa-25cf639eafee"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.392659421Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_56d740a6-4b5f-4b43-8891-206b55ee8f7e/messages
correlation: qa-317e0d05-cd45-4df1-a998-df797d9d7f3f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 5178d1f8-dd76-45e1-bc06-19881fb61e86
X-Correlation-Id: qa-317e0d05-cd45-4df1-a998-df797d9d7f3f
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-317e0d05-cd45-4df1-a998-df797d9d7f3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_56d740a6-4b5f-4b43-8891-206b55ee8f7e/messages","correlationId":"qa-317e0d05-cd45-4df1-a998-df797d9d7f3f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d88cf73a-2c92-485a-9dad-efb6685a797f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d88cf73a-2c92-485a-9dad-efb6685a797f
Content-Type: application/json

--- request body ---
{"handle":"qa-25cf639eafee","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d88cf73a-2c92-485a-9dad-efb6685a797f
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_76a11296-61e5-4924-b80e-8d6805db6b1e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7db21e7-7f39-4eab-9db0-c35d80b7b066

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7db21e7-7f39-4eab-9db0-c35d80b7b066
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7db21e7-7f39-4eab-9db0-c35d80b7b066
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
correlation: qa-6f6b5211-d124-4c3b-9ab6-b2c865b5ff2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f6b5211-d124-4c3b-9ab6-b2c865b5ff2a
Content-Type: application/json

--- request body ---
{"handle":"qa-25cf639eafee","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f6b5211-d124-4c3b-9ab6-b2c865b5ff2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6f6b5211-d124-4c3b-9ab6-b2c865b5ff2a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc02ab26-5c9d-4801-9d64-914b04dbd4d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc02ab26-5c9d-4801-9d64-914b04dbd4d8
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc02ab26-5c9d-4801-9d64-914b04dbd4d8
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
correlation: qa-e3e48d04-f23a-462b-b13a-10aa49c3d0d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3e48d04-f23a-462b-b13a-10aa49c3d0d8
Content-Type: application/json

--- request body ---
{"handle":"qa-0dcf5b14bcc2","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3e48d04-f23a-462b-b13a-10aa49c3d0d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e3e48d04-f23a-462b-b13a-10aa49c3d0d8"}
```
