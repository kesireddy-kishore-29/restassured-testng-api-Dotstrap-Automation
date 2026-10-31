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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-cb512c56-5f00-4f8e-8254-6b5b9ceb74fa` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-731c0c7b-39a9-4370-ace6-f5d60e52d0a6` |
| 3 | `POST /v1/auth/token` | 200 | 65 | `qa-e3bcefb5-d938-4e0c-8c7d-a721141428e1` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-09233cc7-0212-4420-ae10-c2b6a6190c47` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 22 | `qa-1618c0a5-61a4-4e3c-9556-749624da2383` |
| 6 | `POST /v1/auth/token` | 200 | 6 | `qa-913c6470-400f-406e-bef9-7e51ad135ca8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-a567b958-1fa2-4114-ac64-dcc83db2d8fe` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-f1f64353-256d-43f4-ab17-5d552a77d78b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-f30e94ea-0d68-4cd3-ae0f-096e4f8f4bc8` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-0b635323-057d-4b91-bab1-d7b7087e185b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cb512c56-5f00-4f8e-8254-6b5b9ceb74fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb512c56-5f00-4f8e-8254-6b5b9ceb74fa
Content-Type: application/json

--- request body ---
{"handle":"qa-d6fc14a3df7b","displayName":"QA d6fc14a3df7b","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb512c56-5f00-4f8e-8254-6b5b9ceb74fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 8
Location: /v1/accounts/qa-d6fc14a3df7b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9181227b-9669-42ac-b727-245ae74c0ee6","handle":"qa-d6fc14a3df7b","displayName":"QA d6fc14a3df7b","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.632306305Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-731c0c7b-39a9-4370-ace6-f5d60e52d0a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-731c0c7b-39a9-4370-ace6-f5d60e52d0a6
Content-Type: application/json

--- request body ---
{"handle":"qa-0a05bb7c3873","displayName":"QA 0a05bb7c3873","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-731c0c7b-39a9-4370-ace6-f5d60e52d0a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 8
Location: /v1/accounts/qa-0a05bb7c3873
X-Served-Region: eu
Content-Length: 181

{"id":"acc_043e8c55-3390-4274-ad47-4d2e1840691f","handle":"qa-0a05bb7c3873","displayName":"QA 0a05bb7c3873","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.669758134Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e3bcefb5-d938-4e0c-8c7d-a721141428e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3bcefb5-d938-4e0c-8c7d-a721141428e1
Content-Type: application/json

--- request body ---
{"handle":"qa-d6fc14a3df7b","password":"****"}

--- response: 200 in 65 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3bcefb5-d938-4e0c-8c7d-a721141428e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9181227b-9669-42ac-b727-245ae74c0ee6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-09233cc7-0212-4420-ae10-c2b6a6190c47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09233cc7-0212-4420-ae10-c2b6a6190c47
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0a05bb7c3873","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-09233cc7-0212-4420-ae10-c2b6a6190c47
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
Location: /v1/conversations/cnv_541f0d86-f77b-4990-b6c4-5f9222312ab8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_541f0d86-f77b-4990-b6c4-5f9222312ab8","subject":"Error contract","status":"open","region":"eu","participants":["qa-d6fc14a3df7b","qa-0a05bb7c3873"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.756664950Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_541f0d86-f77b-4990-b6c4-5f9222312ab8/messages
correlation: qa-1618c0a5-61a4-4e3c-9556-749624da2383

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1618c0a5-61a4-4e3c-9556-749624da2383
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1618c0a5-61a4-4e3c-9556-749624da2383
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_541f0d86-f77b-4990-b6c4-5f9222312ab8/messages","correlationId":"qa-1618c0a5-61a4-4e3c-9556-749624da2383"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-913c6470-400f-406e-bef9-7e51ad135ca8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-913c6470-400f-406e-bef9-7e51ad135ca8
Content-Type: application/json

--- request body ---
{"handle":"qa-0a05bb7c3873","password":"****"}

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-913c6470-400f-406e-bef9-7e51ad135ca8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_043e8c55-3390-4274-ad47-4d2e1840691f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a567b958-1fa2-4114-ac64-dcc83db2d8fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a567b958-1fa2-4114-ac64-dcc83db2d8fe
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a567b958-1fa2-4114-ac64-dcc83db2d8fe
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
correlation: qa-f1f64353-256d-43f4-ab17-5d552a77d78b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1f64353-256d-43f4-ab17-5d552a77d78b
Content-Type: application/json

--- request body ---
{"handle":"qa-0a05bb7c3873","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1f64353-256d-43f4-ab17-5d552a77d78b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f1f64353-256d-43f4-ab17-5d552a77d78b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f30e94ea-0d68-4cd3-ae0f-096e4f8f4bc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f30e94ea-0d68-4cd3-ae0f-096e4f8f4bc8
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f30e94ea-0d68-4cd3-ae0f-096e4f8f4bc8
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
correlation: qa-0b635323-057d-4b91-bab1-d7b7087e185b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b635323-057d-4b91-bab1-d7b7087e185b
Content-Type: application/json

--- request body ---
{"handle":"qa-d6fc14a3df7b","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b635323-057d-4b91-bab1-d7b7087e185b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0b635323-057d-4b91-bab1-d7b7087e185b"}
```
