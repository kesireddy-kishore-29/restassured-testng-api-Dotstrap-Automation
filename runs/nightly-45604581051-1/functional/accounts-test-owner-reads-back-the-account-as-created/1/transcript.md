# Transcript: The owner reads back exactly what was created

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#ownerReadsBackTheAccountAsCreated` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-83274b4e-8bd7-4e93-8bf1-599f17ce8aed` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-538198c8-b928-4daa-a648-a9b941aabdef` |
| 3 | `GET /v1/accounts/me` | 200 | 10 | `qa-d8028f9d-93a7-482a-b63f-dfe78ea63367` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-d506e4c4-33f9-4ebb-b241-4f01a1b5f0d7` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-0185d097-c70c-482e-a3ba-1e83ac96bb51` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-83274b4e-8bd7-4e93-8bf1-599f17ce8aed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83274b4e-8bd7-4e93-8bf1-599f17ce8aed
Content-Type: application/json

--- request body ---
{"handle":"qa-9d68d466b35e","displayName":"QA 9d68d466b35e","password":"****","region":"in"}

--- response: 201 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-83274b4e-8bd7-4e93-8bf1-599f17ce8aed
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
Location: /v1/accounts/qa-9d68d466b35e
X-Served-Region: in
Content-Length: 181

{"id":"acc_dfed2bae-c83c-4c3b-88f6-30bf69e8bbc7","handle":"qa-9d68d466b35e","displayName":"QA 9d68d466b35e","region":"in","role":"user","createdAt":"2026-11-25T11:27:58.203770761Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-538198c8-b928-4daa-a648-a9b941aabdef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-538198c8-b928-4daa-a648-a9b941aabdef
Content-Type: application/json

--- request body ---
{"handle":"qa-9d68d466b35e","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-538198c8-b928-4daa-a648-a9b941aabdef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dfed2bae-c83c-4c3b-88f6-30bf69e8bbc7"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d8028f9d-93a7-482a-b63f-dfe78ea63367

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8028f9d-93a7-482a-b63f-dfe78ea63367
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8028f9d-93a7-482a-b63f-dfe78ea63367
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
X-Served-Region: in
Content-Length: 181

{"id":"acc_dfed2bae-c83c-4c3b-88f6-30bf69e8bbc7","handle":"qa-9d68d466b35e","displayName":"QA 9d68d466b35e","region":"in","role":"user","createdAt":"2026-11-25T11:27:58.203770761Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d506e4c4-33f9-4ebb-b241-4f01a1b5f0d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d506e4c4-33f9-4ebb-b241-4f01a1b5f0d7
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d506e4c4-33f9-4ebb-b241-4f01a1b5f0d7
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
X-Served-Region: in
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-0185d097-c70c-482e-a3ba-1e83ac96bb51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0185d097-c70c-482e-a3ba-1e83ac96bb51
Content-Type: application/json

--- request body ---
{"handle":"qa-9d68d466b35e","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0185d097-c70c-482e-a3ba-1e83ac96bb51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0185d097-c70c-482e-a3ba-1e83ac96bb51"}
```
