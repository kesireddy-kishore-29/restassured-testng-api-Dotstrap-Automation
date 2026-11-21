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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-a0806e09-78d1-4b54-a942-485e7c6fe2a9` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-edd1302a-13a3-4605-a673-98c465676a2d` |
| 3 | `GET /v1/accounts/me` | 200 | 9 | `qa-45965d86-3415-4af1-815b-3e187ff26dbc` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-aa26449b-55d9-417a-9c26-c4dfd81118a1` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-f5fbad2d-a144-40b5-8d76-dc5dfee60fac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a0806e09-78d1-4b54-a942-485e7c6fe2a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0806e09-78d1-4b54-a942-485e7c6fe2a9
Content-Type: application/json

--- request body ---
{"handle":"qa-90cfabca50e5","displayName":"QA 90cfabca50e5","password":"****","region":"in"}

--- response: 201 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0806e09-78d1-4b54-a942-485e7c6fe2a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-90cfabca50e5
X-Served-Region: in
Content-Length: 181

{"id":"acc_f7c29ec3-bb99-4630-a1b7-15ab282a57a2","handle":"qa-90cfabca50e5","displayName":"QA 90cfabca50e5","region":"in","role":"user","createdAt":"2026-11-15T09:36:10.386995039Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-edd1302a-13a3-4605-a673-98c465676a2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edd1302a-13a3-4605-a673-98c465676a2d
Content-Type: application/json

--- request body ---
{"handle":"qa-90cfabca50e5","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-edd1302a-13a3-4605-a673-98c465676a2d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f7c29ec3-bb99-4630-a1b7-15ab282a57a2"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-45965d86-3415-4af1-815b-3e187ff26dbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45965d86-3415-4af1-815b-3e187ff26dbc
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-45965d86-3415-4af1-815b-3e187ff26dbc
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

{"id":"acc_f7c29ec3-bb99-4630-a1b7-15ab282a57a2","handle":"qa-90cfabca50e5","displayName":"QA 90cfabca50e5","region":"in","role":"user","createdAt":"2026-11-15T09:36:10.386995039Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa26449b-55d9-417a-9c26-c4dfd81118a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa26449b-55d9-417a-9c26-c4dfd81118a1
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa26449b-55d9-417a-9c26-c4dfd81118a1
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
correlation: qa-f5fbad2d-a144-40b5-8d76-dc5dfee60fac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5fbad2d-a144-40b5-8d76-dc5dfee60fac
Content-Type: application/json

--- request body ---
{"handle":"qa-90cfabca50e5","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5fbad2d-a144-40b5-8d76-dc5dfee60fac
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f5fbad2d-a144-40b5-8d76-dc5dfee60fac"}
```
