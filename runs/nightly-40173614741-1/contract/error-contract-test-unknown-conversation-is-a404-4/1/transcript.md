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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-2cd98b2b-b86c-4aa1-bd87-deac1b264dff` |
| 2 | `POST /v1/auth/token` | 200 | 30 | `qa-e19e43fe-db5f-42f0-a24e-c95c126825ef` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 8 | `qa-fa37f199-4bcf-407e-bbd9-7c9777e7b690` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-072eba1c-6512-40ba-8aae-d1d5b29c5aac` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-b7092480-4f99-41fd-a2f9-5a204cbaf743` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2cd98b2b-b86c-4aa1-bd87-deac1b264dff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cd98b2b-b86c-4aa1-bd87-deac1b264dff
Content-Type: application/json

--- request body ---
{"handle":"qa-30ca2113218d","displayName":"QA 30ca2113218d","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cd98b2b-b86c-4aa1-bd87-deac1b264dff
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
Location: /v1/accounts/qa-30ca2113218d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eb548f42-9a95-414f-9b6b-082942345421","handle":"qa-30ca2113218d","displayName":"QA 30ca2113218d","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.647645929Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e19e43fe-db5f-42f0-a24e-c95c126825ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e19e43fe-db5f-42f0-a24e-c95c126825ef
Content-Type: application/json

--- request body ---
{"handle":"qa-30ca2113218d","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-e19e43fe-db5f-42f0-a24e-c95c126825ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb548f42-9a95-414f-9b6b-082942345421"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-fa37f199-4bcf-407e-bbd9-7c9777e7b690

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa37f199-4bcf-407e-bbd9-7c9777e7b690
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa37f199-4bcf-407e-bbd9-7c9777e7b690
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-fa37f199-4bcf-407e-bbd9-7c9777e7b690"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-072eba1c-6512-40ba-8aae-d1d5b29c5aac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-072eba1c-6512-40ba-8aae-d1d5b29c5aac
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-072eba1c-6512-40ba-8aae-d1d5b29c5aac
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
correlation: qa-b7092480-4f99-41fd-a2f9-5a204cbaf743

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7092480-4f99-41fd-a2f9-5a204cbaf743
Content-Type: application/json

--- request body ---
{"handle":"qa-30ca2113218d","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7092480-4f99-41fd-a2f9-5a204cbaf743
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b7092480-4f99-41fd-a2f9-5a204cbaf743"}
```
