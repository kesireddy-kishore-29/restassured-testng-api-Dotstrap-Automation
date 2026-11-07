# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-97b50dfb-9bcb-486e-9ef0-1bac5d8de897` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-eb2712ee-470c-470e-82ca-f38259968475` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 8 | `qa-7880cc97-cf06-4f61-832f-41200616e504` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-10273d1c-de9f-42db-857b-5be23a6103a1` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-d7521508-6d6f-4efb-9378-8d1a3b0967a2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-97b50dfb-9bcb-486e-9ef0-1bac5d8de897

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97b50dfb-9bcb-486e-9ef0-1bac5d8de897
Content-Type: application/json

--- request body ---
{"handle":"qa-6a2baa4f0531","displayName":"QA 6a2baa4f0531","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-97b50dfb-9bcb-486e-9ef0-1bac5d8de897
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 6
Location: /v1/accounts/qa-6a2baa4f0531
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bff078e2-67e3-4671-9279-5262eed308f4","handle":"qa-6a2baa4f0531","displayName":"QA 6a2baa4f0531","region":"eu","role":"user","createdAt":"2026-11-05T09:37:57.500862598Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-eb2712ee-470c-470e-82ca-f38259968475

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb2712ee-470c-470e-82ca-f38259968475
Content-Type: application/json

--- request body ---
{"handle":"qa-6a2baa4f0531","password":"****"}

--- response: 200 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb2712ee-470c-470e-82ca-f38259968475
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bff078e2-67e3-4671-9279-5262eed308f4"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-7880cc97-cf06-4f61-832f-41200616e504

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7880cc97-cf06-4f61-832f-41200616e504
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7880cc97-cf06-4f61-832f-41200616e504
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-7880cc97-cf06-4f61-832f-41200616e504"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-10273d1c-de9f-42db-857b-5be23a6103a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10273d1c-de9f-42db-857b-5be23a6103a1
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-10273d1c-de9f-42db-857b-5be23a6103a1
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
correlation: qa-d7521508-6d6f-4efb-9378-8d1a3b0967a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7521508-6d6f-4efb-9378-8d1a3b0967a2
Content-Type: application/json

--- request body ---
{"handle":"qa-6a2baa4f0531","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7521508-6d6f-4efb-9378-8d1a3b0967a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d7521508-6d6f-4efb-9378-8d1a3b0967a2"}
```
