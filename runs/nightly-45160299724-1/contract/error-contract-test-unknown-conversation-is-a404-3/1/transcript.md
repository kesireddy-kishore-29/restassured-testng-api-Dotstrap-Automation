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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-a95f14c5-9931-4726-b964-624002a3c504` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-1a2029da-6234-490a-bf63-d3478efbc7cc` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 14 | `qa-b4cdcdde-c0ca-4c85-ba30-08bf42f746a4` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-e2fdc8c2-8577-4298-ba46-605b765985c2` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-077a6c35-7c3d-41cd-abe6-d9166eed7259` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a95f14c5-9931-4726-b964-624002a3c504

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a95f14c5-9931-4726-b964-624002a3c504
Content-Type: application/json

--- request body ---
{"handle":"qa-a48578a116d4","displayName":"QA a48578a116d4","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a95f14c5-9931-4726-b964-624002a3c504
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 7
Location: /v1/accounts/qa-a48578a116d4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_017883d5-127f-412f-8bff-c72365f6059d","handle":"qa-a48578a116d4","displayName":"QA a48578a116d4","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.434229065Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1a2029da-6234-490a-bf63-d3478efbc7cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a2029da-6234-490a-bf63-d3478efbc7cc
Content-Type: application/json

--- request body ---
{"handle":"qa-a48578a116d4","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a2029da-6234-490a-bf63-d3478efbc7cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_017883d5-127f-412f-8bff-c72365f6059d"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-b4cdcdde-c0ca-4c85-ba30-08bf42f746a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4cdcdde-c0ca-4c85-ba30-08bf42f746a4
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4cdcdde-c0ca-4c85-ba30-08bf42f746a4
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-b4cdcdde-c0ca-4c85-ba30-08bf42f746a4"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2fdc8c2-8577-4298-ba46-605b765985c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2fdc8c2-8577-4298-ba46-605b765985c2
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2fdc8c2-8577-4298-ba46-605b765985c2
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
correlation: qa-077a6c35-7c3d-41cd-abe6-d9166eed7259

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-077a6c35-7c3d-41cd-abe6-d9166eed7259
Content-Type: application/json

--- request body ---
{"handle":"qa-a48578a116d4","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-077a6c35-7c3d-41cd-abe6-d9166eed7259
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-077a6c35-7c3d-41cd-abe6-d9166eed7259"}
```
