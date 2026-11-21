# Transcript: A slow server cannot hang the client

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#clientTimeoutIsEnforcedWithinItsBudget` |
| Features | FEAT-RES-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-ca9d6959-0c2a-4178-96e9-ecb4728dfda1` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-569da202-8279-485d-9f7d-4f10af55cfa8` |
| 3 | `GET /v1/accounts/me` | error | 808 | `qa-06a7a27f-1681-4a00-9c5c-b9aae402a1a2` |
| 4 | `GET /v1/accounts/me` | error | 803 | `qa-bdd5aa3f-a9b9-4a98-9225-5c69ceb520e1` |
| 5 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-2f4e7871-58a2-4af6-ade1-df2073822a31` |
| 6 | `POST /v1/auth/token` | 401 | 3 | `qa-4204f7c9-d091-4416-9411-24ef9edb158a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ca9d6959-0c2a-4178-96e9-ecb4728dfda1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca9d6959-0c2a-4178-96e9-ecb4728dfda1
Content-Type: application/json

--- request body ---
{"handle":"qa-4468889daaf8","displayName":"QA 4468889daaf8","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca9d6959-0c2a-4178-96e9-ecb4728dfda1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-4468889daaf8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1578c746-0674-4054-bd09-c09f37f5ea1b","handle":"qa-4468889daaf8","displayName":"QA 4468889daaf8","region":"eu","role":"user","createdAt":"2026-11-18T10:19:38.466268580Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-569da202-8279-485d-9f7d-4f10af55cfa8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-569da202-8279-485d-9f7d-4f10af55cfa8
Content-Type: application/json

--- request body ---
{"handle":"qa-4468889daaf8","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-569da202-8279-485d-9f7d-4f10af55cfa8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1578c746-0674-4054-bd09-c09f37f5ea1b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-06a7a27f-1681-4a00-9c5c-b9aae402a1a2

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 71811757-3702-4a2d-a8d0-2d79f8217b08
X-Correlation-Id: qa-06a7a27f-1681-4a00-9c5c-b9aae402a1a2
Content-Type: application/json

--- response: none in 808 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-bdd5aa3f-a9b9-4a98-9225-5c69ceb520e1

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: 71811757-3702-4a2d-a8d0-2d79f8217b08
X-Correlation-Id: qa-bdd5aa3f-a9b9-4a98-9225-5c69ceb520e1
Content-Type: application/json

--- response: none in 803 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2f4e7871-58a2-4af6-ade1-df2073822a31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f4e7871-58a2-4af6-ade1-df2073822a31
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2f4e7871-58a2-4af6-ade1-df2073822a31
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4204f7c9-d091-4416-9411-24ef9edb158a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4204f7c9-d091-4416-9411-24ef9edb158a
Content-Type: application/json

--- request body ---
{"handle":"qa-4468889daaf8","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4204f7c9-d091-4416-9411-24ef9edb158a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4204f7c9-d091-4416-9411-24ef9edb158a"}
```
