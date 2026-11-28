# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-a2fff3b7-0631-495c-848b-b89166066ab6` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-f26c2925-de0c-4635-ac8c-3a3b0ed46ad1` |
| 3 | `GET /v1/conversations/{id}` | 404 | 12 | `qa-a7d9d1e8-3971-4475-855c-828f28c64f83` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 14 | `qa-c6c3ba2e-3466-49de-8b38-8e565d10d4da` |
| 5 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-c3cb00f1-54d9-425d-9bcf-a4bcf7d0e924` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-593515b3-9f1c-40d4-8d99-43aad0af9e94` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a2fff3b7-0631-495c-848b-b89166066ab6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2fff3b7-0631-495c-848b-b89166066ab6
Content-Type: application/json

--- request body ---
{"handle":"qa-1c784799fdd1","displayName":"QA 1c784799fdd1","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2fff3b7-0631-495c-848b-b89166066ab6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Location: /v1/accounts/qa-1c784799fdd1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b07bbf63-a16a-48f4-b65a-584937259f4e","handle":"qa-1c784799fdd1","displayName":"QA 1c784799fdd1","region":"eu","role":"user","createdAt":"2026-11-24T12:38:00.590312757Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f26c2925-de0c-4635-ac8c-3a3b0ed46ad1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f26c2925-de0c-4635-ac8c-3a3b0ed46ad1
Content-Type: application/json

--- request body ---
{"handle":"qa-1c784799fdd1","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f26c2925-de0c-4635-ac8c-3a3b0ed46ad1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b07bbf63-a16a-48f4-b65a-584937259f4e"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-a7d9d1e8-3971-4475-855c-828f28c64f83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7d9d1e8-3971-4475-855c-828f28c64f83
Content-Type: application/json

--- response: 404 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7d9d1e8-3971-4475-855c-828f28c64f83
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-a7d9d1e8-3971-4475-855c-828f28c64f83"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-c6c3ba2e-3466-49de-8b38-8e565d10d4da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6c3ba2e-3466-49de-8b38-8e565d10d4da
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c6c3ba2e-3466-49de-8b38-8e565d10d4da
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-c6c3ba2e-3466-49de-8b38-8e565d10d4da"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3cb00f1-54d9-425d-9bcf-a4bcf7d0e924

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3cb00f1-54d9-425d-9bcf-a4bcf7d0e924
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c3cb00f1-54d9-425d-9bcf-a4bcf7d0e924
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-593515b3-9f1c-40d4-8d99-43aad0af9e94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-593515b3-9f1c-40d4-8d99-43aad0af9e94
Content-Type: application/json

--- request body ---
{"handle":"qa-1c784799fdd1","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-593515b3-9f1c-40d4-8d99-43aad0af9e94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-593515b3-9f1c-40d4-8d99-43aad0af9e94"}
```
