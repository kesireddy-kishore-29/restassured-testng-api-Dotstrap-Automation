# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-7affbbf2-3ac9-4091-9250-7081906a2bf6` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-5dc57f1b-4cb9-4c50-8ae6-aab0af684240` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 4 | `qa-3fb820a7-1647-49db-bf7e-9fc23d287e66` |
| 4 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-6988f40b-048e-4bdf-bd54-d4c02657f469` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-010d743a-0028-4034-be04-feb4bcb1d0db` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7affbbf2-3ac9-4091-9250-7081906a2bf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7affbbf2-3ac9-4091-9250-7081906a2bf6
Content-Type: application/json

--- request body ---
{"handle":"qa-4cf01b30e515","displayName":"QA 4cf01b30e515","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-7affbbf2-3ac9-4091-9250-7081906a2bf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Location: /v1/accounts/qa-4cf01b30e515
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fba636ab-a39f-4769-94a5-5da4f2d7008f","handle":"qa-4cf01b30e515","displayName":"QA 4cf01b30e515","region":"eu","role":"user","createdAt":"2026-11-02T09:38:38.144415504Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5dc57f1b-4cb9-4c50-8ae6-aab0af684240

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dc57f1b-4cb9-4c50-8ae6-aab0af684240
Content-Type: application/json

--- request body ---
{"handle":"qa-4cf01b30e515","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dc57f1b-4cb9-4c50-8ae6-aab0af684240
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fba636ab-a39f-4769-94a5-5da4f2d7008f"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-3fb820a7-1647-49db-bf7e-9fc23d287e66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fb820a7-1647-49db-bf7e-9fc23d287e66
Content-Type: application/json

--- response: 404 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3fb820a7-1647-49db-bf7e-9fc23d287e66
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-3fb820a7-1647-49db-bf7e-9fc23d287e66"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6988f40b-048e-4bdf-bd54-d4c02657f469

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6988f40b-048e-4bdf-bd54-d4c02657f469
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6988f40b-048e-4bdf-bd54-d4c02657f469
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
correlation: qa-010d743a-0028-4034-be04-feb4bcb1d0db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-010d743a-0028-4034-be04-feb4bcb1d0db
Content-Type: application/json

--- request body ---
{"handle":"qa-4cf01b30e515","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-010d743a-0028-4034-be04-feb4bcb1d0db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-010d743a-0028-4034-be04-feb4bcb1d0db"}
```
