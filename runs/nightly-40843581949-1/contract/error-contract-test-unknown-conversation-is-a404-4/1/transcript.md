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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-a74e8fd7-bcaa-476f-b4a0-3dafd607f735` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-3685ea96-e2d4-4980-aa67-3d33c9c17ae9` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 8 | `qa-0750102b-ba5c-4548-aec9-24fdb2896b1b` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-fb2da0ea-670e-4a25-9882-49da62248e20` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-ae7b6442-5f59-4cdf-9c30-677f6a8b53b3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a74e8fd7-bcaa-476f-b4a0-3dafd607f735

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a74e8fd7-bcaa-476f-b4a0-3dafd607f735
Content-Type: application/json

--- request body ---
{"handle":"qa-b2e629cff73e","displayName":"QA b2e629cff73e","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a74e8fd7-bcaa-476f-b4a0-3dafd607f735
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 6
Location: /v1/accounts/qa-b2e629cff73e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3a1723ee-baa2-4413-a196-316010ce2cf5","handle":"qa-b2e629cff73e","displayName":"QA b2e629cff73e","region":"eu","role":"user","createdAt":"2026-10-29T08:39:02.029359570Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3685ea96-e2d4-4980-aa67-3d33c9c17ae9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3685ea96-e2d4-4980-aa67-3d33c9c17ae9
Content-Type: application/json

--- request body ---
{"handle":"qa-b2e629cff73e","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3685ea96-e2d4-4980-aa67-3d33c9c17ae9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a1723ee-baa2-4413-a196-316010ce2cf5"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-0750102b-ba5c-4548-aec9-24fdb2896b1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0750102b-ba5c-4548-aec9-24fdb2896b1b
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0750102b-ba5c-4548-aec9-24fdb2896b1b
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-0750102b-ba5c-4548-aec9-24fdb2896b1b"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fb2da0ea-670e-4a25-9882-49da62248e20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb2da0ea-670e-4a25-9882-49da62248e20
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fb2da0ea-670e-4a25-9882-49da62248e20
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
correlation: qa-ae7b6442-5f59-4cdf-9c30-677f6a8b53b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae7b6442-5f59-4cdf-9c30-677f6a8b53b3
Content-Type: application/json

--- request body ---
{"handle":"qa-b2e629cff73e","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae7b6442-5f59-4cdf-9c30-677f6a8b53b3
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae7b6442-5f59-4cdf-9c30-677f6a8b53b3"}
```
