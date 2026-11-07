# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-99911993-d4b2-4f1f-ae1c-ff0cc984aa14` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-b24e022a-1daa-4eb2-a9c5-02eee6168dd9` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-6c01f6d8-35fd-40f2-9556-dc33d5cdbf6f` |
| 4 | `POST /v1/conversations` | 201 | 32 | `qa-ed09e66c-0aae-427c-b23f-c81272d51bba` |
| 5 | `POST /v1/auth/token` | 415 | 82 | `qa-2f40f6e2-1669-4348-ad34-1f37a68b731f` |
| 6 | `POST /v1/auth/token` | 200 | 69 | `qa-46d8c326-fb32-47ca-9409-584df0a4636c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-bf0b5d35-10e7-43aa-9cdf-453a4916378d` |
| 8 | `POST /v1/auth/token` | 401 | 32 | `qa-90df3e76-9e31-4c66-86ff-113045a88142` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-54f613d2-d118-46ec-9472-6af200855729` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-ae5524fa-1642-4d9f-905e-7b6585c1a628` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-99911993-d4b2-4f1f-ae1c-ff0cc984aa14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99911993-d4b2-4f1f-ae1c-ff0cc984aa14
Content-Type: application/json

--- request body ---
{"handle":"qa-af82a3b04303","displayName":"QA af82a3b04303","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-99911993-d4b2-4f1f-ae1c-ff0cc984aa14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Location: /v1/accounts/qa-af82a3b04303
X-Served-Region: eu
Content-Length: 181

{"id":"acc_44101b56-4b18-459a-88f0-da0fe8afe2fc","handle":"qa-af82a3b04303","displayName":"QA af82a3b04303","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.191564979Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b24e022a-1daa-4eb2-a9c5-02eee6168dd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b24e022a-1daa-4eb2-a9c5-02eee6168dd9
Content-Type: application/json

--- request body ---
{"handle":"qa-27638b5c96e4","displayName":"QA 27638b5c96e4","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-b24e022a-1daa-4eb2-a9c5-02eee6168dd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Location: /v1/accounts/qa-27638b5c96e4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f8d8347-4a9c-4c45-8c9a-cb081475ba52","handle":"qa-27638b5c96e4","displayName":"QA 27638b5c96e4","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.265108479Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6c01f6d8-35fd-40f2-9556-dc33d5cdbf6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c01f6d8-35fd-40f2-9556-dc33d5cdbf6f
Content-Type: application/json

--- request body ---
{"handle":"qa-af82a3b04303","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c01f6d8-35fd-40f2-9556-dc33d5cdbf6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_44101b56-4b18-459a-88f0-da0fe8afe2fc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ed09e66c-0aae-427c-b23f-c81272d51bba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed09e66c-0aae-427c-b23f-c81272d51bba
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-27638b5c96e4","subject":"Error contract","message":"Hi"}

--- response: 201 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed09e66c-0aae-427c-b23f-c81272d51bba
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
Location: /v1/conversations/cnv_873a13ec-6f64-4d6d-a741-50f993473601
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_873a13ec-6f64-4d6d-a741-50f993473601","subject":"Error contract","status":"open","region":"eu","participants":["qa-af82a3b04303","qa-27638b5c96e4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.389362476Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2f40f6e2-1669-4348-ad34-1f37a68b731f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f40f6e2-1669-4348-ad34-1f37a68b731f
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 82 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f40f6e2-1669-4348-ad34-1f37a68b731f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-2f40f6e2-1669-4348-ad34-1f37a68b731f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-46d8c326-fb32-47ca-9409-584df0a4636c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46d8c326-fb32-47ca-9409-584df0a4636c
Content-Type: application/json

--- request body ---
{"handle":"qa-27638b5c96e4","password":"****"}

--- response: 200 in 69 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-46d8c326-fb32-47ca-9409-584df0a4636c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f8d8347-4a9c-4c45-8c9a-cb081475ba52"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bf0b5d35-10e7-43aa-9cdf-453a4916378d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf0b5d35-10e7-43aa-9cdf-453a4916378d
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bf0b5d35-10e7-43aa-9cdf-453a4916378d
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
correlation: qa-90df3e76-9e31-4c66-86ff-113045a88142

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90df3e76-9e31-4c66-86ff-113045a88142
Content-Type: application/json

--- request body ---
{"handle":"qa-27638b5c96e4","password":"****"}

--- response: 401 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90df3e76-9e31-4c66-86ff-113045a88142
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-90df3e76-9e31-4c66-86ff-113045a88142"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-54f613d2-d118-46ec-9472-6af200855729

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54f613d2-d118-46ec-9472-6af200855729
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-54f613d2-d118-46ec-9472-6af200855729
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
correlation: qa-ae5524fa-1642-4d9f-905e-7b6585c1a628

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae5524fa-1642-4d9f-905e-7b6585c1a628
Content-Type: application/json

--- request body ---
{"handle":"qa-af82a3b04303","password":"****"}

--- response: 401 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae5524fa-1642-4d9f-905e-7b6585c1a628
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae5524fa-1642-4d9f-905e-7b6585c1a628"}
```
