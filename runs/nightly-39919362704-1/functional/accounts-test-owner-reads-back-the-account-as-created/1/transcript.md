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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-4a4e71c6-addb-412d-8308-d1c34b38287d` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-964101d7-9618-4679-9629-6c84720df8eb` |
| 3 | `GET /v1/accounts/me` | 200 | 15 | `qa-0e2fa708-6a68-4b9e-9bd1-542684560c6f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-536c5616-d61e-422b-9a3d-ec9fcbdb9806` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-4f1dbe93-ebc9-48bb-9d51-8b51a049da3f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4a4e71c6-addb-412d-8308-d1c34b38287d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a4e71c6-addb-412d-8308-d1c34b38287d
Content-Type: application/json

--- request body ---
{"handle":"qa-afafcfc09b6a","displayName":"QA afafcfc09b6a","password":"****","region":"in"}

--- response: 201 in 21 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a4e71c6-addb-412d-8308-d1c34b38287d
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
Location: /v1/accounts/qa-afafcfc09b6a
X-Served-Region: in
Content-Length: 181

{"id":"acc_e5d6058b-6b03-40e0-94bf-4100feb912be","handle":"qa-afafcfc09b6a","displayName":"QA afafcfc09b6a","region":"in","role":"user","createdAt":"2026-10-23T07:42:04.204317226Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-964101d7-9618-4679-9629-6c84720df8eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-964101d7-9618-4679-9629-6c84720df8eb
Content-Type: application/json

--- request body ---
{"handle":"qa-afafcfc09b6a","password":"****"}

--- response: 200 in 16 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-964101d7-9618-4679-9629-6c84720df8eb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e5d6058b-6b03-40e0-94bf-4100feb912be"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e2fa708-6a68-4b9e-9bd1-542684560c6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e2fa708-6a68-4b9e-9bd1-542684560c6f
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e2fa708-6a68-4b9e-9bd1-542684560c6f
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

{"id":"acc_e5d6058b-6b03-40e0-94bf-4100feb912be","handle":"qa-afafcfc09b6a","displayName":"QA afafcfc09b6a","region":"in","role":"user","createdAt":"2026-10-23T07:42:04.204317226Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-536c5616-d61e-422b-9a3d-ec9fcbdb9806

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-536c5616-d61e-422b-9a3d-ec9fcbdb9806
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-536c5616-d61e-422b-9a3d-ec9fcbdb9806
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
correlation: qa-4f1dbe93-ebc9-48bb-9d51-8b51a049da3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f1dbe93-ebc9-48bb-9d51-8b51a049da3f
Content-Type: application/json

--- request body ---
{"handle":"qa-afafcfc09b6a","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f1dbe93-ebc9-48bb-9d51-8b51a049da3f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f1dbe93-ebc9-48bb-9d51-8b51a049da3f"}
```
