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
| 1 | `POST /v1/accounts` | 201 | 6 | `qa-9cfd144d-fcc6-4cd4-9857-8e85151c1d3a` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-23dc81bc-cd23-4aa6-b553-9b4fdc77fa95` |
| 3 | `GET /v1/conversations/{id}` | 404 | 11 | `qa-67da5103-4eab-4d4c-bc9d-c22c0b3f8660` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-8d2b8c19-8df8-4360-849f-d9ce72587b1d` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-15da78cc-ac96-44b9-96bf-2be821be47a7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9cfd144d-fcc6-4cd4-9857-8e85151c1d3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cfd144d-fcc6-4cd4-9857-8e85151c1d3a
Content-Type: application/json

--- request body ---
{"handle":"qa-e55b358c39af","displayName":"QA e55b358c39af","password":"****","region":"eu"}

--- response: 201 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cfd144d-fcc6-4cd4-9857-8e85151c1d3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Location: /v1/accounts/qa-e55b358c39af
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f9bf088d-8d1f-4e49-82b9-fe719ed62df0","handle":"qa-e55b358c39af","displayName":"QA e55b358c39af","region":"eu","role":"user","createdAt":"2026-11-24T12:38:16.109787129Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-23dc81bc-cd23-4aa6-b553-9b4fdc77fa95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23dc81bc-cd23-4aa6-b553-9b4fdc77fa95
Content-Type: application/json

--- request body ---
{"handle":"qa-e55b358c39af","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-23dc81bc-cd23-4aa6-b553-9b4fdc77fa95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f9bf088d-8d1f-4e49-82b9-fe719ed62df0"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-67da5103-4eab-4d4c-bc9d-c22c0b3f8660

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67da5103-4eab-4d4c-bc9d-c22c0b3f8660
Content-Type: application/json

--- response: 404 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67da5103-4eab-4d4c-bc9d-c22c0b3f8660
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-67da5103-4eab-4d4c-bc9d-c22c0b3f8660"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8d2b8c19-8df8-4360-849f-d9ce72587b1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d2b8c19-8df8-4360-849f-d9ce72587b1d
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8d2b8c19-8df8-4360-849f-d9ce72587b1d
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
correlation: qa-15da78cc-ac96-44b9-96bf-2be821be47a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15da78cc-ac96-44b9-96bf-2be821be47a7
Content-Type: application/json

--- request body ---
{"handle":"qa-e55b358c39af","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15da78cc-ac96-44b9-96bf-2be821be47a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-15da78cc-ac96-44b9-96bf-2be821be47a7"}
```
