# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-6ce92229-8b4b-4263-930d-9195df6c9b9c` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-8cc4a697-7ec9-4f9d-8ae9-409d12520b1e` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-3b7b856a-3793-44ea-84ed-ae3ea51a863f` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-3ba89815-3f33-47d7-a23d-c3e73ce4cdbf` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 23 | `qa-f9f25e70-ec39-47d4-a03d-4446c1252032` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-29dc5544-98e0-4b55-ad2b-93eb596e2697` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-f1ce9f21-5e0b-4016-a68a-714cb76f2bbd` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-fea230fd-11e5-4bfd-b929-76079512399b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-ad7c2f39-1ba1-446a-b77d-d18c0588e5e9` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-8e1f8f6e-b167-4b61-9e8d-dd0ef56d3552` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6ce92229-8b4b-4263-930d-9195df6c9b9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ce92229-8b4b-4263-930d-9195df6c9b9c
Content-Type: application/json

--- request body ---
{"handle":"qa-ec63a8359e96","displayName":"QA ec63a8359e96","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ce92229-8b4b-4263-930d-9195df6c9b9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 7
Location: /v1/accounts/qa-ec63a8359e96
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0e9ac3f1-7107-4259-b28a-9abddeffb909","handle":"qa-ec63a8359e96","displayName":"QA ec63a8359e96","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.740329850Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8cc4a697-7ec9-4f9d-8ae9-409d12520b1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cc4a697-7ec9-4f9d-8ae9-409d12520b1e
Content-Type: application/json

--- request body ---
{"handle":"qa-978ac4145ef5","displayName":"QA 978ac4145ef5","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cc4a697-7ec9-4f9d-8ae9-409d12520b1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 7
Location: /v1/accounts/qa-978ac4145ef5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d41082d0-c848-4d26-8c40-71a2088b3cd2","handle":"qa-978ac4145ef5","displayName":"QA 978ac4145ef5","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.794208487Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3b7b856a-3793-44ea-84ed-ae3ea51a863f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b7b856a-3793-44ea-84ed-ae3ea51a863f
Content-Type: application/json

--- request body ---
{"handle":"qa-ec63a8359e96","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b7b856a-3793-44ea-84ed-ae3ea51a863f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0e9ac3f1-7107-4259-b28a-9abddeffb909"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3ba89815-3f33-47d7-a23d-c3e73ce4cdbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ba89815-3f33-47d7-a23d-c3e73ce4cdbf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-978ac4145ef5","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ba89815-3f33-47d7-a23d-c3e73ce4cdbf
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
Location: /v1/conversations/cnv_21667ab2-3617-4cd5-8403-c59801103977
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_21667ab2-3617-4cd5-8403-c59801103977","subject":"Error contract","status":"open","region":"eu","participants":["qa-ec63a8359e96","qa-978ac4145ef5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.875695518Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_21667ab2-3617-4cd5-8403-c59801103977/close
correlation: qa-f9f25e70-ec39-47d4-a03d-4446c1252032

--- request headers ---
Accept: application/json
X-Fault-Key: e2287683-2dbe-4316-b42b-9a77b9b6e25e
X-Fault: unavailable-once
X-Correlation-Id: qa-f9f25e70-ec39-47d4-a03d-4446c1252032
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9f25e70-ec39-47d4-a03d-4446c1252032
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_21667ab2-3617-4cd5-8403-c59801103977/close","correlationId":"qa-f9f25e70-ec39-47d4-a03d-4446c1252032"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-29dc5544-98e0-4b55-ad2b-93eb596e2697

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29dc5544-98e0-4b55-ad2b-93eb596e2697
Content-Type: application/json

--- request body ---
{"handle":"qa-978ac4145ef5","password":"****"}

--- response: 200 in 32 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-29dc5544-98e0-4b55-ad2b-93eb596e2697
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d41082d0-c848-4d26-8c40-71a2088b3cd2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1ce9f21-5e0b-4016-a68a-714cb76f2bbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1ce9f21-5e0b-4016-a68a-714cb76f2bbd
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1ce9f21-5e0b-4016-a68a-714cb76f2bbd
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
correlation: qa-fea230fd-11e5-4bfd-b929-76079512399b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fea230fd-11e5-4bfd-b929-76079512399b
Content-Type: application/json

--- request body ---
{"handle":"qa-978ac4145ef5","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fea230fd-11e5-4bfd-b929-76079512399b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fea230fd-11e5-4bfd-b929-76079512399b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ad7c2f39-1ba1-446a-b77d-d18c0588e5e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad7c2f39-1ba1-446a-b77d-d18c0588e5e9
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ad7c2f39-1ba1-446a-b77d-d18c0588e5e9
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
correlation: qa-8e1f8f6e-b167-4b61-9e8d-dd0ef56d3552

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e1f8f6e-b167-4b61-9e8d-dd0ef56d3552
Content-Type: application/json

--- request body ---
{"handle":"qa-ec63a8359e96","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e1f8f6e-b167-4b61-9e8d-dd0ef56d3552
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8e1f8f6e-b167-4b61-9e8d-dd0ef56d3552"}
```
