# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-20d718f9-251a-4a30-b72e-c53a05557154` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-3d99109d-7920-4ab0-b383-cf3b446a543a` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-8ca9b795-44f6-4c2b-bb2d-07cc7c41cd33` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-aa53236d-b584-4753-aabd-ab257e5b015b` |
| 5 | `POST /v1/conversations` | 400 | 9 | `qa-5ecbfd29-903f-4938-b755-8b67cf3ca159` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-3fdf414d-81da-458c-b17e-bae6835524ad` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-339e0468-1271-4df3-97d8-21899e2e8be6` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-dba62918-a1a8-48e4-b351-ca6acd424457` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-b26826e3-8e62-4dc9-b54c-8abdc1c06a75` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-4dcd88d8-dc50-41ea-b0c4-7a3da7a2e85f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-20d718f9-251a-4a30-b72e-c53a05557154

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20d718f9-251a-4a30-b72e-c53a05557154
Content-Type: application/json

--- request body ---
{"handle":"qa-4d3a72bc1931","displayName":"QA 4d3a72bc1931","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-20d718f9-251a-4a30-b72e-c53a05557154
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 7
Location: /v1/accounts/qa-4d3a72bc1931
X-Served-Region: eu
Content-Length: 181

{"id":"acc_270b1727-6eb6-48d2-8c86-63b4d54433e2","handle":"qa-4d3a72bc1931","displayName":"QA 4d3a72bc1931","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.826695331Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3d99109d-7920-4ab0-b383-cf3b446a543a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d99109d-7920-4ab0-b383-cf3b446a543a
Content-Type: application/json

--- request body ---
{"handle":"qa-526473482c3f","displayName":"QA 526473482c3f","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d99109d-7920-4ab0-b383-cf3b446a543a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 7
Location: /v1/accounts/qa-526473482c3f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b4065d10-9542-47cc-b267-a704b6f681b9","handle":"qa-526473482c3f","displayName":"QA 526473482c3f","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.861320083Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8ca9b795-44f6-4c2b-bb2d-07cc7c41cd33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ca9b795-44f6-4c2b-bb2d-07cc7c41cd33
Content-Type: application/json

--- request body ---
{"handle":"qa-4d3a72bc1931","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ca9b795-44f6-4c2b-bb2d-07cc7c41cd33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_270b1727-6eb6-48d2-8c86-63b4d54433e2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aa53236d-b584-4753-aabd-ab257e5b015b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa53236d-b584-4753-aabd-ab257e5b015b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-526473482c3f","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa53236d-b584-4753-aabd-ab257e5b015b
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
Location: /v1/conversations/cnv_80202910-b8aa-4c25-bbee-28c4f6eeaafc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_80202910-b8aa-4c25-bbee-28c4f6eeaafc","subject":"Error contract","status":"open","region":"eu","participants":["qa-4d3a72bc1931","qa-526473482c3f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.956770004Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-5ecbfd29-903f-4938-b755-8b67cf3ca159

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ecbfd29-903f-4938-b755-8b67cf3ca159
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ecbfd29-903f-4938-b755-8b67cf3ca159
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-5ecbfd29-903f-4938-b755-8b67cf3ca159"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3fdf414d-81da-458c-b17e-bae6835524ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fdf414d-81da-458c-b17e-bae6835524ad
Content-Type: application/json

--- request body ---
{"handle":"qa-526473482c3f","password":"****"}

--- response: 200 in 41 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fdf414d-81da-458c-b17e-bae6835524ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b4065d10-9542-47cc-b267-a704b6f681b9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-339e0468-1271-4df3-97d8-21899e2e8be6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-339e0468-1271-4df3-97d8-21899e2e8be6
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-339e0468-1271-4df3-97d8-21899e2e8be6
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
correlation: qa-dba62918-a1a8-48e4-b351-ca6acd424457

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dba62918-a1a8-48e4-b351-ca6acd424457
Content-Type: application/json

--- request body ---
{"handle":"qa-526473482c3f","password":"****"}

--- response: 401 in 31 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dba62918-a1a8-48e4-b351-ca6acd424457
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dba62918-a1a8-48e4-b351-ca6acd424457"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b26826e3-8e62-4dc9-b54c-8abdc1c06a75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b26826e3-8e62-4dc9-b54c-8abdc1c06a75
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b26826e3-8e62-4dc9-b54c-8abdc1c06a75
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
correlation: qa-4dcd88d8-dc50-41ea-b0c4-7a3da7a2e85f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dcd88d8-dc50-41ea-b0c4-7a3da7a2e85f
Content-Type: application/json

--- request body ---
{"handle":"qa-4d3a72bc1931","password":"****"}

--- response: 401 in 32 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4dcd88d8-dc50-41ea-b0c4-7a3da7a2e85f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4dcd88d8-dc50-41ea-b0c4-7a3da7a2e85f"}
```
