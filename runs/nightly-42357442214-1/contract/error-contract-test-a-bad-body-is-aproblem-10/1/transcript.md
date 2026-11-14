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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-1dbf3f0b-27a4-4d66-b2e8-4626dfb0b0f0` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-7834f0c3-d056-4d99-b937-7d4b64322de3` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-f8f88ba9-0ca7-449b-bec5-c781d5b68a76` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-58c7109f-36ba-49f7-b6a5-695a21ccc4ef` |
| 5 | `POST /v1/conversations` | 415 | 46 | `qa-f29afbd7-3a35-4a9d-bc83-662d0956d080` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-e61cada5-42c5-4c6e-96f9-d05cc1832697` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-1f07e357-b479-42e8-b6af-fc5e92f10355` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-5ae417cb-81b8-41db-a6b1-cf75ae07f0ce` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-29952195-df03-4f2d-b824-2fcc2be018dc` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-a64328a4-636d-4298-bd27-8712ca45ce8d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1dbf3f0b-27a4-4d66-b2e8-4626dfb0b0f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dbf3f0b-27a4-4d66-b2e8-4626dfb0b0f0
Content-Type: application/json

--- request body ---
{"handle":"qa-081d3f527ca2","displayName":"QA 081d3f527ca2","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dbf3f0b-27a4-4d66-b2e8-4626dfb0b0f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Location: /v1/accounts/qa-081d3f527ca2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c74a76fa-c0f8-4e87-b8ce-1a2c349c645e","handle":"qa-081d3f527ca2","displayName":"QA 081d3f527ca2","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.921413292Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7834f0c3-d056-4d99-b937-7d4b64322de3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7834f0c3-d056-4d99-b937-7d4b64322de3
Content-Type: application/json

--- request body ---
{"handle":"qa-a11035d61548","displayName":"QA a11035d61548","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7834f0c3-d056-4d99-b937-7d4b64322de3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Location: /v1/accounts/qa-a11035d61548
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d2bed616-8fa3-4bd9-af30-aef0d769c707","handle":"qa-a11035d61548","displayName":"QA a11035d61548","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.968639318Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f8f88ba9-0ca7-449b-bec5-c781d5b68a76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8f88ba9-0ca7-449b-bec5-c781d5b68a76
Content-Type: application/json

--- request body ---
{"handle":"qa-081d3f527ca2","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8f88ba9-0ca7-449b-bec5-c781d5b68a76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c74a76fa-c0f8-4e87-b8ce-1a2c349c645e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-58c7109f-36ba-49f7-b6a5-695a21ccc4ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58c7109f-36ba-49f7-b6a5-695a21ccc4ef
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a11035d61548","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-58c7109f-36ba-49f7-b6a5-695a21ccc4ef
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
Location: /v1/conversations/cnv_767e95c6-3a65-4eb3-9f49-e3cfbe31baba
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_767e95c6-3a65-4eb3-9f49-e3cfbe31baba","subject":"Error contract","status":"open","region":"eu","participants":["qa-081d3f527ca2","qa-a11035d61548"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.034038803Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f29afbd7-3a35-4a9d-bc83-662d0956d080

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f29afbd7-3a35-4a9d-bc83-662d0956d080
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 46 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f29afbd7-3a35-4a9d-bc83-662d0956d080
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-f29afbd7-3a35-4a9d-bc83-662d0956d080"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e61cada5-42c5-4c6e-96f9-d05cc1832697

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e61cada5-42c5-4c6e-96f9-d05cc1832697
Content-Type: application/json

--- request body ---
{"handle":"qa-a11035d61548","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e61cada5-42c5-4c6e-96f9-d05cc1832697
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d2bed616-8fa3-4bd9-af30-aef0d769c707"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1f07e357-b479-42e8-b6af-fc5e92f10355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f07e357-b479-42e8-b6af-fc5e92f10355
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1f07e357-b479-42e8-b6af-fc5e92f10355
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
correlation: qa-5ae417cb-81b8-41db-a6b1-cf75ae07f0ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ae417cb-81b8-41db-a6b1-cf75ae07f0ce
Content-Type: application/json

--- request body ---
{"handle":"qa-a11035d61548","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ae417cb-81b8-41db-a6b1-cf75ae07f0ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5ae417cb-81b8-41db-a6b1-cf75ae07f0ce"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-29952195-df03-4f2d-b824-2fcc2be018dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29952195-df03-4f2d-b824-2fcc2be018dc
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-29952195-df03-4f2d-b824-2fcc2be018dc
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
correlation: qa-a64328a4-636d-4298-bd27-8712ca45ce8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a64328a4-636d-4298-bd27-8712ca45ce8d
Content-Type: application/json

--- request body ---
{"handle":"qa-081d3f527ca2","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a64328a4-636d-4298-bd27-8712ca45ce8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a64328a4-636d-4298-bd27-8712ca45ce8d"}
```
