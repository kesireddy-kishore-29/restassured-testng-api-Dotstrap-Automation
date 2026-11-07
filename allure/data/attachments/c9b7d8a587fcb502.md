# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-76bd2bc7-546a-483d-a15a-5eb1f43c6d05` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-effff1df-d7d6-4fa0-b89e-bf01ea058c4b` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-864d1651-46b4-4b99-9949-36c2ad8b5c65` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-6b022f7a-a58e-4836-b408-510d577193bb` |
| 5 | `GET /v1/conversations` | 503 | 19 | `qa-8c9729a5-b7c2-441f-bb40-b9764719b31a` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-18130d09-9105-4d9c-98f0-57b2f6c3caaf` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-75d6c845-2a9d-4f2b-b485-627782c4d487` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-e0e5a6e1-df43-469f-8cbe-646edb6986c9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-b52e42ec-8ae5-4cce-8f57-ba53abec58cc` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-226ac7fd-5d11-4737-b2e8-d7fe92649089` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-76bd2bc7-546a-483d-a15a-5eb1f43c6d05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76bd2bc7-546a-483d-a15a-5eb1f43c6d05
Content-Type: application/json

--- request body ---
{"handle":"qa-4fb0937ef6c9","displayName":"QA 4fb0937ef6c9","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-76bd2bc7-546a-483d-a15a-5eb1f43c6d05
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
Location: /v1/accounts/qa-4fb0937ef6c9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_24ffcd90-6095-4004-b203-872b9ff42d44","handle":"qa-4fb0937ef6c9","displayName":"QA 4fb0937ef6c9","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.517074511Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-effff1df-d7d6-4fa0-b89e-bf01ea058c4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-effff1df-d7d6-4fa0-b89e-bf01ea058c4b
Content-Type: application/json

--- request body ---
{"handle":"qa-bde7df598a57","displayName":"QA bde7df598a57","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-effff1df-d7d6-4fa0-b89e-bf01ea058c4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Location: /v1/accounts/qa-bde7df598a57
X-Served-Region: eu
Content-Length: 181

{"id":"acc_943ed20c-8e20-4cca-a1e4-6d28d911c9ca","handle":"qa-bde7df598a57","displayName":"QA bde7df598a57","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.561083024Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-864d1651-46b4-4b99-9949-36c2ad8b5c65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-864d1651-46b4-4b99-9949-36c2ad8b5c65
Content-Type: application/json

--- request body ---
{"handle":"qa-4fb0937ef6c9","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-864d1651-46b4-4b99-9949-36c2ad8b5c65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24ffcd90-6095-4004-b203-872b9ff42d44"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6b022f7a-a58e-4836-b408-510d577193bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b022f7a-a58e-4836-b408-510d577193bb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bde7df598a57","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b022f7a-a58e-4836-b408-510d577193bb
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
Location: /v1/conversations/cnv_97a69eb7-e223-4908-9a8f-08015311955b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_97a69eb7-e223-4908-9a8f-08015311955b","subject":"Error contract","status":"open","region":"eu","participants":["qa-4fb0937ef6c9","qa-bde7df598a57"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:58.653071316Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-8c9729a5-b7c2-441f-bb40-b9764719b31a

--- request headers ---
Accept: application/json
X-Fault-Key: 92992336-251c-4700-94fb-fb34cd5f3dfb
X-Fault: unavailable-once
X-Correlation-Id: qa-8c9729a5-b7c2-441f-bb40-b9764719b31a
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c9729a5-b7c2-441f-bb40-b9764719b31a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-8c9729a5-b7c2-441f-bb40-b9764719b31a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-18130d09-9105-4d9c-98f0-57b2f6c3caaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18130d09-9105-4d9c-98f0-57b2f6c3caaf
Content-Type: application/json

--- request body ---
{"handle":"qa-bde7df598a57","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-18130d09-9105-4d9c-98f0-57b2f6c3caaf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_943ed20c-8e20-4cca-a1e4-6d28d911c9ca"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-75d6c845-2a9d-4f2b-b485-627782c4d487

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75d6c845-2a9d-4f2b-b485-627782c4d487
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-75d6c845-2a9d-4f2b-b485-627782c4d487
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
correlation: qa-e0e5a6e1-df43-469f-8cbe-646edb6986c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0e5a6e1-df43-469f-8cbe-646edb6986c9
Content-Type: application/json

--- request body ---
{"handle":"qa-bde7df598a57","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0e5a6e1-df43-469f-8cbe-646edb6986c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e0e5a6e1-df43-469f-8cbe-646edb6986c9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b52e42ec-8ae5-4cce-8f57-ba53abec58cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b52e42ec-8ae5-4cce-8f57-ba53abec58cc
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b52e42ec-8ae5-4cce-8f57-ba53abec58cc
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
correlation: qa-226ac7fd-5d11-4737-b2e8-d7fe92649089

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-226ac7fd-5d11-4737-b2e8-d7fe92649089
Content-Type: application/json

--- request body ---
{"handle":"qa-4fb0937ef6c9","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-226ac7fd-5d11-4737-b2e8-d7fe92649089
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-226ac7fd-5d11-4737-b2e8-d7fe92649089"}
```
