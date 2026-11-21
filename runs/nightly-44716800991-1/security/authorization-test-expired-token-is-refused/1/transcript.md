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
| 1 | `POST /v1/accounts` | 201 | 272 | `qa-fdefc312-59be-4bf5-bb4c-c0063bba0053` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-7e705351-1af1-4726-ada2-31a23fe40886` |
| 3 | `GET /v1/accounts/me` | 200 | 13 | `qa-ee8ec95c-825f-4083-8222-4a99711e1afb` |
| 4 | `GET /v1/accounts/me` | 200 | 16 | `qa-8fd9e96b-975a-44a0-b7de-5f4bb952227e` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-fb173e3c-3c50-44b4-a7a8-d7d813614dfc` |
| 6 | `GET /v1/accounts/me` | 401 | 5 | `qa-03a36eed-30f3-4488-9b37-761fbef09ed2` |
| 7 | `GET /v1/accounts/me` | 401 | 7 | `qa-b8cc8048-f11f-43ff-ba8f-36784295dcbc` |
| 8 | `POST /v1/auth/token` | 200 | 7 | `qa-5c791b40-d235-43df-bef9-ea39c121b90f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-b27e5a81-11bc-4ef7-b308-a67afbfcfe26` |
| 10 | `POST /v1/auth/token` | 401 | 3 | `qa-36eea3f2-e1a1-4a65-9b17-1cf4b03b53ea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fdefc312-59be-4bf5-bb4c-c0063bba0053

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdefc312-59be-4bf5-bb4c-c0063bba0053
Content-Type: application/json

--- request body ---
{"handle":"qa-1b507dfcf858","displayName":"QA 1b507dfcf858","password":"****","region":"eu"}

--- response: 201 in 272 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdefc312-59be-4bf5-bb4c-c0063bba0053
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-1b507dfcf858
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a284befc-c027-44bf-9e34-1d1bc30c286d","handle":"qa-1b507dfcf858","displayName":"QA 1b507dfcf858","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.016696949Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7e705351-1af1-4726-ada2-31a23fe40886

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e705351-1af1-4726-ada2-31a23fe40886
Content-Type: application/json

--- request body ---
{"handle":"qa-1b507dfcf858","password":"****","ttlSeconds":1}

--- response: 200 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e705351-1af1-4726-ada2-31a23fe40886
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_a284befc-c027-44bf-9e34-1d1bc30c286d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee8ec95c-825f-4083-8222-4a99711e1afb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee8ec95c-825f-4083-8222-4a99711e1afb
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee8ec95c-825f-4083-8222-4a99711e1afb
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

{"id":"acc_a284befc-c027-44bf-9e34-1d1bc30c286d","handle":"qa-1b507dfcf858","displayName":"QA 1b507dfcf858","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.016696949Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-8fd9e96b-975a-44a0-b7de-5f4bb952227e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fd9e96b-975a-44a0-b7de-5f4bb952227e
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fd9e96b-975a-44a0-b7de-5f4bb952227e
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

{"id":"acc_a284befc-c027-44bf-9e34-1d1bc30c286d","handle":"qa-1b507dfcf858","displayName":"QA 1b507dfcf858","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.016696949Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-fb173e3c-3c50-44b4-a7a8-d7d813614dfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb173e3c-3c50-44b4-a7a8-d7d813614dfc
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb173e3c-3c50-44b4-a7a8-d7d813614dfc
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

{"id":"acc_a284befc-c027-44bf-9e34-1d1bc30c286d","handle":"qa-1b507dfcf858","displayName":"QA 1b507dfcf858","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.016696949Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-03a36eed-30f3-4488-9b37-761fbef09ed2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03a36eed-30f3-4488-9b37-761fbef09ed2
Content-Type: application/json

--- response: 401 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03a36eed-30f3-4488-9b37-761fbef09ed2
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-03a36eed-30f3-4488-9b37-761fbef09ed2"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8cc8048-f11f-43ff-ba8f-36784295dcbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8cc8048-f11f-43ff-ba8f-36784295dcbc
Content-Type: application/json

--- response: 401 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8cc8048-f11f-43ff-ba8f-36784295dcbc
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-b8cc8048-f11f-43ff-ba8f-36784295dcbc"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-5c791b40-d235-43df-bef9-ea39c121b90f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c791b40-d235-43df-bef9-ea39c121b90f
Content-Type: application/json

--- request body ---
{"handle":"qa-1b507dfcf858","password":"****"}

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c791b40-d235-43df-bef9-ea39c121b90f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a284befc-c027-44bf-9e34-1d1bc30c286d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b27e5a81-11bc-4ef7-b308-a67afbfcfe26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b27e5a81-11bc-4ef7-b308-a67afbfcfe26
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b27e5a81-11bc-4ef7-b308-a67afbfcfe26
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
correlation: qa-36eea3f2-e1a1-4a65-9b17-1cf4b03b53ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36eea3f2-e1a1-4a65-9b17-1cf4b03b53ea
Content-Type: application/json

--- request body ---
{"handle":"qa-1b507dfcf858","password":"****"}

--- response: 401 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-36eea3f2-e1a1-4a65-9b17-1cf4b03b53ea
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-36eea3f2-e1a1-4a65-9b17-1cf4b03b53ea"}
```
