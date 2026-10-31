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
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-6bdf4065-8c50-4f36-9263-7e0ee83989c9` |
| 2 | `POST /v1/auth/token` | 200 | 27 | `qa-f5ca63cf-9e46-4dd4-a17a-bee5326e22ab` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 19 | `qa-8b2b0e8f-1c9d-498b-b7eb-a244e2f4d1b3` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5eb44821-4c12-4751-8f8d-f71f8af389a7` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-dda8abf7-2add-4a08-ab80-697d4d6e6206` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6bdf4065-8c50-4f36-9263-7e0ee83989c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bdf4065-8c50-4f36-9263-7e0ee83989c9
Content-Type: application/json

--- request body ---
{"handle":"qa-2abd2f5ea680","displayName":"QA 2abd2f5ea680","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bdf4065-8c50-4f36-9263-7e0ee83989c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 6
Location: /v1/accounts/qa-2abd2f5ea680
X-Served-Region: eu
Content-Length: 181

{"id":"acc_77451a03-8690-46d2-97b7-6a593156f58e","handle":"qa-2abd2f5ea680","displayName":"QA 2abd2f5ea680","region":"eu","role":"user","createdAt":"2026-10-30T08:46:06.149821983Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f5ca63cf-9e46-4dd4-a17a-bee5326e22ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5ca63cf-9e46-4dd4-a17a-bee5326e22ab
Content-Type: application/json

--- request body ---
{"handle":"qa-2abd2f5ea680","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5ca63cf-9e46-4dd4-a17a-bee5326e22ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_77451a03-8690-46d2-97b7-6a593156f58e"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-8b2b0e8f-1c9d-498b-b7eb-a244e2f4d1b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b2b0e8f-1c9d-498b-b7eb-a244e2f4d1b3
Content-Type: application/json

--- response: 404 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b2b0e8f-1c9d-498b-b7eb-a244e2f4d1b3
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-8b2b0e8f-1c9d-498b-b7eb-a244e2f4d1b3"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5eb44821-4c12-4751-8f8d-f71f8af389a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5eb44821-4c12-4751-8f8d-f71f8af389a7
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5eb44821-4c12-4751-8f8d-f71f8af389a7
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
correlation: qa-dda8abf7-2add-4a08-ab80-697d4d6e6206

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dda8abf7-2add-4a08-ab80-697d4d6e6206
Content-Type: application/json

--- request body ---
{"handle":"qa-2abd2f5ea680","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dda8abf7-2add-4a08-ab80-697d4d6e6206
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dda8abf7-2add-4a08-ab80-697d4d6e6206"}
```
