# Transcript: A token stops working when it expires

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#expiredTokenIsRefused` |
| Features | FEAT-SEC-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 356 | `qa-ad24e4e6-8313-476c-b019-79f5a7a3fed1` |
| 2 | `POST /v1/auth/token` | 200 | 27 | `qa-6c9b361a-eb77-4675-ae64-34c792614260` |
| 3 | `GET /v1/accounts/me` | 200 | 16 | `qa-9d1feb6f-dcdc-4448-989d-f85a2ffcb5cc` |
| 4 | `GET /v1/accounts/me` | 200 | 10 | `qa-bd5bf0e7-71e8-485a-b77d-f024f5835871` |
| 5 | `GET /v1/accounts/me` | 200 | 10 | `qa-60612626-3a65-4b56-8afb-343f36e0bcda` |
| 6 | `GET /v1/accounts/me` | 401 | 4 | `qa-9c766990-b02b-4b91-b72b-6d52bf4713f9` |
| 7 | `GET /v1/accounts/me` | 401 | 4 | `qa-ee32cc6c-c745-47aa-994b-e10fe66fe879` |
| 8 | `POST /v1/auth/token` | 200 | 7 | `qa-f03bfd8c-4d13-4625-8f92-22540eaeef24` |
| 9 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-fa6ebd33-85a4-45d7-87ec-3f8aa1b12693` |
| 10 | `POST /v1/auth/token` | 401 | 3 | `qa-1b34e3fa-c598-4bf3-95a7-d57ef58cf753` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ad24e4e6-8313-476c-b019-79f5a7a3fed1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad24e4e6-8313-476c-b019-79f5a7a3fed1
Content-Type: application/json

--- request body ---
{"handle":"qa-798928ae2cc7","displayName":"QA 798928ae2cc7","password":"****","region":"eu"}

--- response: 201 in 356 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad24e4e6-8313-476c-b019-79f5a7a3fed1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-798928ae2cc7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_146ca0d5-24e8-4db0-9181-62d827751e01","handle":"qa-798928ae2cc7","displayName":"QA 798928ae2cc7","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.100400533Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6c9b361a-eb77-4675-ae64-34c792614260

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c9b361a-eb77-4675-ae64-34c792614260
Content-Type: application/json

--- request body ---
{"handle":"qa-798928ae2cc7","password":"****","ttlSeconds":1}

--- response: 200 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c9b361a-eb77-4675-ae64-34c792614260
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_146ca0d5-24e8-4db0-9181-62d827751e01"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d1feb6f-dcdc-4448-989d-f85a2ffcb5cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d1feb6f-dcdc-4448-989d-f85a2ffcb5cc
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d1feb6f-dcdc-4448-989d-f85a2ffcb5cc
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
Content-Length: 181

{"id":"acc_146ca0d5-24e8-4db0-9181-62d827751e01","handle":"qa-798928ae2cc7","displayName":"QA 798928ae2cc7","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.100400533Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd5bf0e7-71e8-485a-b77d-f024f5835871

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd5bf0e7-71e8-485a-b77d-f024f5835871
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd5bf0e7-71e8-485a-b77d-f024f5835871
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
Content-Length: 181

{"id":"acc_146ca0d5-24e8-4db0-9181-62d827751e01","handle":"qa-798928ae2cc7","displayName":"QA 798928ae2cc7","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.100400533Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-60612626-3a65-4b56-8afb-343f36e0bcda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60612626-3a65-4b56-8afb-343f36e0bcda
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-60612626-3a65-4b56-8afb-343f36e0bcda
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
Content-Length: 181

{"id":"acc_146ca0d5-24e8-4db0-9181-62d827751e01","handle":"qa-798928ae2cc7","displayName":"QA 798928ae2cc7","region":"eu","role":"user","createdAt":"2026-11-18T10:19:45.100400533Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c766990-b02b-4b91-b72b-6d52bf4713f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c766990-b02b-4b91-b72b-6d52bf4713f9
Content-Type: application/json

--- response: 401 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c766990-b02b-4b91-b72b-6d52bf4713f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-9c766990-b02b-4b91-b72b-6d52bf4713f9"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee32cc6c-c745-47aa-994b-e10fe66fe879

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee32cc6c-c745-47aa-994b-e10fe66fe879
Content-Type: application/json

--- response: 401 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee32cc6c-c745-47aa-994b-e10fe66fe879
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-ee32cc6c-c745-47aa-994b-e10fe66fe879"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-f03bfd8c-4d13-4625-8f92-22540eaeef24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f03bfd8c-4d13-4625-8f92-22540eaeef24
Content-Type: application/json

--- request body ---
{"handle":"qa-798928ae2cc7","password":"****"}

--- response: 200 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f03bfd8c-4d13-4625-8f92-22540eaeef24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_146ca0d5-24e8-4db0-9181-62d827751e01"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa6ebd33-85a4-45d7-87ec-3f8aa1b12693

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa6ebd33-85a4-45d7-87ec-3f8aa1b12693
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa6ebd33-85a4-45d7-87ec-3f8aa1b12693
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-1b34e3fa-c598-4bf3-95a7-d57ef58cf753

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b34e3fa-c598-4bf3-95a7-d57ef58cf753
Content-Type: application/json

--- request body ---
{"handle":"qa-798928ae2cc7","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b34e3fa-c598-4bf3-95a7-d57ef58cf753
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1b34e3fa-c598-4bf3-95a7-d57ef58cf753"}
```
