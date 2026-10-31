# Transcript: A new display name is stored and returned

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#displayNameChangeIsPersisted` |
| Features | FEAT-ACCT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 463 | `qa-2f805572-37a8-4e78-a0b7-ce03a076b05f` |
| 2 | `POST /v1/auth/token` | 200 | 65 | `qa-b232080a-481b-43c4-923a-7ea48fe21a6b` |
| 3 | `PATCH /v1/accounts/me` | 200 | 76 | `qa-57322a41-d35a-4a7b-b01e-f287efced5a9` |
| 4 | `GET /v1/accounts/me` | 200 | 10 | `qa-7726c061-9d7c-4bce-b9b6-ec48a9223f43` |
| 5 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-a4687126-fc3f-47e7-af77-db5abbdab30d` |
| 6 | `POST /v1/auth/token` | 401 | 24 | `qa-02a6a431-7fa4-49f5-8c48-0264489fff81` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2f805572-37a8-4e78-a0b7-ce03a076b05f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f805572-37a8-4e78-a0b7-ce03a076b05f
Content-Type: application/json

--- request body ---
{"handle":"qa-55d7ce70bf6c","displayName":"QA 55d7ce70bf6c","password":"****","region":"eu"}

--- response: 201 in 463 ms ---
Date: Fri, 23 Oct 2026 07:42:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f805572-37a8-4e78-a0b7-ce03a076b05f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-55d7ce70bf6c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9afdc80a-a8d5-4d93-bf30-92a471bba1dc","handle":"qa-55d7ce70bf6c","displayName":"QA 55d7ce70bf6c","region":"eu","role":"user","createdAt":"2026-10-23T07:42:02.969865781Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b232080a-481b-43c4-923a-7ea48fe21a6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b232080a-481b-43c4-923a-7ea48fe21a6b
Content-Type: application/json

--- request body ---
{"handle":"qa-55d7ce70bf6c","password":"****"}

--- response: 200 in 65 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b232080a-481b-43c4-923a-7ea48fe21a6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9afdc80a-a8d5-4d93-bf30-92a471bba1dc"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-57322a41-d35a-4a7b-b01e-f287efced5a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57322a41-d35a-4a7b-b01e-f287efced5a9
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 76 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-57322a41-d35a-4a7b-b01e-f287efced5a9
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
Content-Length: 179

{"id":"acc_9afdc80a-a8d5-4d93-bf30-92a471bba1dc","handle":"qa-55d7ce70bf6c","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-23T07:42:02.969865781Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-7726c061-9d7c-4bce-b9b6-ec48a9223f43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7726c061-9d7c-4bce-b9b6-ec48a9223f43
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7726c061-9d7c-4bce-b9b6-ec48a9223f43
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
Content-Length: 179

{"id":"acc_9afdc80a-a8d5-4d93-bf30-92a471bba1dc","handle":"qa-55d7ce70bf6c","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-23T07:42:02.969865781Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a4687126-fc3f-47e7-af77-db5abbdab30d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4687126-fc3f-47e7-af77-db5abbdab30d
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a4687126-fc3f-47e7-af77-db5abbdab30d
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-02a6a431-7fa4-49f5-8c48-0264489fff81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02a6a431-7fa4-49f5-8c48-0264489fff81
Content-Type: application/json

--- request body ---
{"handle":"qa-55d7ce70bf6c","password":"****"}

--- response: 401 in 24 ms ---
Date: Fri, 23 Oct 2026 07:42:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02a6a431-7fa4-49f5-8c48-0264489fff81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-02a6a431-7fa4-49f5-8c48-0264489fff81"}
```
