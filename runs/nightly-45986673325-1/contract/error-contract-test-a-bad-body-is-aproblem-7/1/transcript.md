# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-a1fb079a-35d7-478f-a630-0f4d5e2bff05` |
| 2 | `POST /v1/accounts` | 201 | 66 | `qa-729b40f1-0941-4918-aef1-87f6cb038021` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-b9fd0094-a718-4586-8a04-730818de178e` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-ef13e72c-4c91-4103-a136-49d4142e631a` |
| 5 | `PATCH /v1/accounts/me` | 415 | 23 | `qa-6de6c4bc-7821-4b59-8be6-a6e1f9a1c24a` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-270d9456-c661-482f-be23-ed214cee2d47` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-cc60c5d1-757f-4eb8-b595-3997eddca7cf` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-18dffbf4-e641-4f89-8f9a-100097c1a6ef` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-d1ef1f13-a5a0-41fc-85f1-ae03799436e0` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-558ff3ac-a2f0-4b75-bc27-24e1c1a4472d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a1fb079a-35d7-478f-a630-0f4d5e2bff05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1fb079a-35d7-478f-a630-0f4d5e2bff05
Content-Type: application/json

--- request body ---
{"handle":"qa-a6bdb80d07a1","displayName":"QA a6bdb80d07a1","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1fb079a-35d7-478f-a630-0f4d5e2bff05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Location: /v1/accounts/qa-a6bdb80d07a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0a6e9a4f-1c21-4016-b42e-2e66ee686bf0","handle":"qa-a6bdb80d07a1","displayName":"QA a6bdb80d07a1","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.676194815Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-729b40f1-0941-4918-aef1-87f6cb038021

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-729b40f1-0941-4918-aef1-87f6cb038021
Content-Type: application/json

--- request body ---
{"handle":"qa-28a1fdbfc7cb","displayName":"QA 28a1fdbfc7cb","password":"****","region":"eu"}

--- response: 201 in 66 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-729b40f1-0941-4918-aef1-87f6cb038021
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Location: /v1/accounts/qa-28a1fdbfc7cb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3963712a-ad76-4dac-91d2-ad0c74b0ac43","handle":"qa-28a1fdbfc7cb","displayName":"QA 28a1fdbfc7cb","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.738622411Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b9fd0094-a718-4586-8a04-730818de178e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9fd0094-a718-4586-8a04-730818de178e
Content-Type: application/json

--- request body ---
{"handle":"qa-a6bdb80d07a1","password":"****"}

--- response: 200 in 53 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9fd0094-a718-4586-8a04-730818de178e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0a6e9a4f-1c21-4016-b42e-2e66ee686bf0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ef13e72c-4c91-4103-a136-49d4142e631a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef13e72c-4c91-4103-a136-49d4142e631a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-28a1fdbfc7cb","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef13e72c-4c91-4103-a136-49d4142e631a
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
Location: /v1/conversations/cnv_59264764-4712-4a77-946d-47bc53b94797
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_59264764-4712-4a77-946d-47bc53b94797","subject":"Error contract","status":"open","region":"eu","participants":["qa-a6bdb80d07a1","qa-28a1fdbfc7cb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:58.882932536Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-6de6c4bc-7821-4b59-8be6-a6e1f9a1c24a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6de6c4bc-7821-4b59-8be6-a6e1f9a1c24a
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 23 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6de6c4bc-7821-4b59-8be6-a6e1f9a1c24a
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-6de6c4bc-7821-4b59-8be6-a6e1f9a1c24a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-270d9456-c661-482f-be23-ed214cee2d47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-270d9456-c661-482f-be23-ed214cee2d47
Content-Type: application/json

--- request body ---
{"handle":"qa-28a1fdbfc7cb","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-270d9456-c661-482f-be23-ed214cee2d47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3963712a-ad76-4dac-91d2-ad0c74b0ac43"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc60c5d1-757f-4eb8-b595-3997eddca7cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc60c5d1-757f-4eb8-b595-3997eddca7cf
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc60c5d1-757f-4eb8-b595-3997eddca7cf
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
correlation: qa-18dffbf4-e641-4f89-8f9a-100097c1a6ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18dffbf4-e641-4f89-8f9a-100097c1a6ef
Content-Type: application/json

--- request body ---
{"handle":"qa-28a1fdbfc7cb","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18dffbf4-e641-4f89-8f9a-100097c1a6ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18dffbf4-e641-4f89-8f9a-100097c1a6ef"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d1ef1f13-a5a0-41fc-85f1-ae03799436e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1ef1f13-a5a0-41fc-85f1-ae03799436e0
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d1ef1f13-a5a0-41fc-85f1-ae03799436e0
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
correlation: qa-558ff3ac-a2f0-4b75-bc27-24e1c1a4472d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-558ff3ac-a2f0-4b75-bc27-24e1c1a4472d
Content-Type: application/json

--- request body ---
{"handle":"qa-a6bdb80d07a1","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-558ff3ac-a2f0-4b75-bc27-24e1c1a4472d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-558ff3ac-a2f0-4b75-bc27-24e1c1a4472d"}
```
