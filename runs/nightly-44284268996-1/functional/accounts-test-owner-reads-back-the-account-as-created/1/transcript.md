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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-cdf59978-16f3-4696-a2fa-98aac3e3c673` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-478c8f57-3ba0-49c7-8da5-bd42414d2598` |
| 3 | `GET /v1/accounts/me` | 200 | 12 | `qa-50838a16-15ff-43e8-b4af-11fb69776d30` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-6a89169d-b4e8-487d-8337-e0b0d543163d` |
| 5 | `POST /v1/auth/token` | 401 | 21 | `qa-4976c672-cb35-491e-96c5-e4040407af20` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cdf59978-16f3-4696-a2fa-98aac3e3c673

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdf59978-16f3-4696-a2fa-98aac3e3c673
Content-Type: application/json

--- request body ---
{"handle":"qa-c883b0c6de24","displayName":"QA c883b0c6de24","password":"****","region":"in"}

--- response: 201 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdf59978-16f3-4696-a2fa-98aac3e3c673
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
Location: /v1/accounts/qa-c883b0c6de24
X-Served-Region: in
Content-Length: 181

{"id":"acc_e6a1ddcd-5c0c-4140-9386-55b69e4b5628","handle":"qa-c883b0c6de24","displayName":"QA c883b0c6de24","region":"in","role":"user","createdAt":"2026-11-18T10:19:53.071488435Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-478c8f57-3ba0-49c7-8da5-bd42414d2598

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-478c8f57-3ba0-49c7-8da5-bd42414d2598
Content-Type: application/json

--- request body ---
{"handle":"qa-c883b0c6de24","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-478c8f57-3ba0-49c7-8da5-bd42414d2598
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6a1ddcd-5c0c-4140-9386-55b69e4b5628"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-50838a16-15ff-43e8-b4af-11fb69776d30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50838a16-15ff-43e8-b4af-11fb69776d30
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-50838a16-15ff-43e8-b4af-11fb69776d30
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

{"id":"acc_e6a1ddcd-5c0c-4140-9386-55b69e4b5628","handle":"qa-c883b0c6de24","displayName":"QA c883b0c6de24","region":"in","role":"user","createdAt":"2026-11-18T10:19:53.071488435Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6a89169d-b4e8-487d-8337-e0b0d543163d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a89169d-b4e8-487d-8337-e0b0d543163d
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6a89169d-b4e8-487d-8337-e0b0d543163d
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
correlation: qa-4976c672-cb35-491e-96c5-e4040407af20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4976c672-cb35-491e-96c5-e4040407af20
Content-Type: application/json

--- request body ---
{"handle":"qa-c883b0c6de24","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4976c672-cb35-491e-96c5-e4040407af20
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4976c672-cb35-491e-96c5-e4040407af20"}
```
