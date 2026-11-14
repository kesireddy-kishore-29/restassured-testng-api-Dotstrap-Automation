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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-e1a1c640-36af-4c47-b7eb-a5bae7ec8398` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-5d6a737a-a499-4bcb-9bcc-add986fb2776` |
| 3 | `GET /v1/accounts/me` | 200 | 6 | `qa-4471141e-ecda-41a3-a515-3e29bdb63bdd` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-6c41f9a1-3d19-419a-910d-54bc84ab2fea` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-a670e929-bd47-4e55-b3ec-76fd619d8bb3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e1a1c640-36af-4c47-b7eb-a5bae7ec8398

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1a1c640-36af-4c47-b7eb-a5bae7ec8398
Content-Type: application/json

--- request body ---
{"handle":"qa-08de0141fe32","displayName":"QA 08de0141fe32","password":"****","region":"in"}

--- response: 201 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1a1c640-36af-4c47-b7eb-a5bae7ec8398
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-08de0141fe32
X-Served-Region: in
Content-Length: 181

{"id":"acc_3d4e0a9e-a4d4-4501-9854-636c749590fb","handle":"qa-08de0141fe32","displayName":"QA 08de0141fe32","region":"in","role":"user","createdAt":"2026-11-08T09:09:15.512080369Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5d6a737a-a499-4bcb-9bcc-add986fb2776

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d6a737a-a499-4bcb-9bcc-add986fb2776
Content-Type: application/json

--- request body ---
{"handle":"qa-08de0141fe32","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d6a737a-a499-4bcb-9bcc-add986fb2776
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3d4e0a9e-a4d4-4501-9854-636c749590fb"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-4471141e-ecda-41a3-a515-3e29bdb63bdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4471141e-ecda-41a3-a515-3e29bdb63bdd
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4471141e-ecda-41a3-a515-3e29bdb63bdd
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

{"id":"acc_3d4e0a9e-a4d4-4501-9854-636c749590fb","handle":"qa-08de0141fe32","displayName":"QA 08de0141fe32","region":"in","role":"user","createdAt":"2026-11-08T09:09:15.512080369Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c41f9a1-3d19-419a-910d-54bc84ab2fea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c41f9a1-3d19-419a-910d-54bc84ab2fea
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c41f9a1-3d19-419a-910d-54bc84ab2fea
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
correlation: qa-a670e929-bd47-4e55-b3ec-76fd619d8bb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a670e929-bd47-4e55-b3ec-76fd619d8bb3
Content-Type: application/json

--- request body ---
{"handle":"qa-08de0141fe32","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a670e929-bd47-4e55-b3ec-76fd619d8bb3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a670e929-bd47-4e55-b3ec-76fd619d8bb3"}
```
