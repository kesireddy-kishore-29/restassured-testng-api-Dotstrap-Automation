# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-ab58e5e0-76d5-4fed-b887-703bcf9e99f7` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-39a68e69-78d7-413b-bce8-1ed201a96931` |
| 3 | `GET /v1/conversations/{id}` | 404 | 19 | `qa-dc48a81c-be85-4f02-bf4c-efb56704d850` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-a4d07aab-cbee-4532-939a-128d34059eb5` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-85fe35ee-10a7-44be-a6ce-8f325278161f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ab58e5e0-76d5-4fed-b887-703bcf9e99f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab58e5e0-76d5-4fed-b887-703bcf9e99f7
Content-Type: application/json

--- request body ---
{"handle":"qa-cb868867dfdd","displayName":"QA cb868867dfdd","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab58e5e0-76d5-4fed-b887-703bcf9e99f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 6
Location: /v1/accounts/qa-cb868867dfdd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea3706cb-945f-42e9-bb06-a25fa2d0dcae","handle":"qa-cb868867dfdd","displayName":"QA cb868867dfdd","region":"eu","role":"user","createdAt":"2026-11-26T11:02:47.306410359Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-39a68e69-78d7-413b-bce8-1ed201a96931

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39a68e69-78d7-413b-bce8-1ed201a96931
Content-Type: application/json

--- request body ---
{"handle":"qa-cb868867dfdd","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-39a68e69-78d7-413b-bce8-1ed201a96931
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea3706cb-945f-42e9-bb06-a25fa2d0dcae"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-dc48a81c-be85-4f02-bf4c-efb56704d850

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc48a81c-be85-4f02-bf4c-efb56704d850
Content-Type: application/json

--- response: 404 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc48a81c-be85-4f02-bf4c-efb56704d850
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-dc48a81c-be85-4f02-bf4c-efb56704d850"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a4d07aab-cbee-4532-939a-128d34059eb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4d07aab-cbee-4532-939a-128d34059eb5
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a4d07aab-cbee-4532-939a-128d34059eb5
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-85fe35ee-10a7-44be-a6ce-8f325278161f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85fe35ee-10a7-44be-a6ce-8f325278161f
Content-Type: application/json

--- request body ---
{"handle":"qa-cb868867dfdd","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85fe35ee-10a7-44be-a6ce-8f325278161f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-85fe35ee-10a7-44be-a6ce-8f325278161f"}
```
