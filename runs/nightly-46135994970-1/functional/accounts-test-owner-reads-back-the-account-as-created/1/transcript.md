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
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-d14bbf59-1e89-4b22-8b90-3fe481fd67f9` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-df255327-d6da-420a-820b-c9701c3927f1` |
| 3 | `GET /v1/accounts/me` | 200 | 6 | `qa-fd0fe95a-1199-4a52-94a7-e864bc058063` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-ad6ced99-ad58-4677-8217-322e82e43c81` |
| 5 | `POST /v1/auth/token` | 401 | 21 | `qa-acf7900b-a868-4ee2-bb6c-059e6943a84a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d14bbf59-1e89-4b22-8b90-3fe481fd67f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d14bbf59-1e89-4b22-8b90-3fe481fd67f9
Content-Type: application/json

--- request body ---
{"handle":"qa-9acd4eb717ba","displayName":"QA 9acd4eb717ba","password":"****","region":"in"}

--- response: 201 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d14bbf59-1e89-4b22-8b90-3fe481fd67f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-9acd4eb717ba
X-Served-Region: in
Content-Length: 181

{"id":"acc_4f5baacb-06e7-463e-8d49-174f447739a4","handle":"qa-9acd4eb717ba","displayName":"QA 9acd4eb717ba","region":"in","role":"user","createdAt":"2026-11-28T10:37:15.103988459Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-df255327-d6da-420a-820b-c9701c3927f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df255327-d6da-420a-820b-c9701c3927f1
Content-Type: application/json

--- request body ---
{"handle":"qa-9acd4eb717ba","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-df255327-d6da-420a-820b-c9701c3927f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4f5baacb-06e7-463e-8d49-174f447739a4"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd0fe95a-1199-4a52-94a7-e864bc058063

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd0fe95a-1199-4a52-94a7-e864bc058063
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd0fe95a-1199-4a52-94a7-e864bc058063
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

{"id":"acc_4f5baacb-06e7-463e-8d49-174f447739a4","handle":"qa-9acd4eb717ba","displayName":"QA 9acd4eb717ba","region":"in","role":"user","createdAt":"2026-11-28T10:37:15.103988459Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ad6ced99-ad58-4677-8217-322e82e43c81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad6ced99-ad58-4677-8217-322e82e43c81
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ad6ced99-ad58-4677-8217-322e82e43c81
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
correlation: qa-acf7900b-a868-4ee2-bb6c-059e6943a84a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acf7900b-a868-4ee2-bb6c-059e6943a84a
Content-Type: application/json

--- request body ---
{"handle":"qa-9acd4eb717ba","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-acf7900b-a868-4ee2-bb6c-059e6943a84a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-acf7900b-a868-4ee2-bb6c-059e6943a84a"}
```
