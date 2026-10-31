# Transcript: Requests are served by the home region, whichever edge they arrive at [US, in]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[2]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-003cac5b-b3ad-4c35-b980-0fc49f37d9c9` |
| 2 | `POST /v1/auth/token` | 200 | 20 | `qa-02b09b65-fe7c-4ac8-8e66-d1c39d8fe346` |
| 3 | `GET /v1/accounts/me` | 200 | 6 | `qa-9eab2e14-4a38-4b22-bc78-79a9b2ae5671` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-e2b34294-22d9-4329-bd93-28ef03c87d07` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-da422edc-97f0-4679-9c11-0fbadc321637` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-003cac5b-b3ad-4c35-b980-0fc49f37d9c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-003cac5b-b3ad-4c35-b980-0fc49f37d9c9
Content-Type: application/json

--- request body ---
{"handle":"qa-eea7ea03a9d4","displayName":"QA eea7ea03a9d4","password":"****","region":"us"}

--- response: 201 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-003cac5b-b3ad-4c35-b980-0fc49f37d9c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-eea7ea03a9d4
X-Served-Region: us
Content-Length: 181

{"id":"acc_72e292ee-b1aa-486c-9283-381dcde6e7ff","handle":"qa-eea7ea03a9d4","displayName":"QA eea7ea03a9d4","region":"us","role":"user","createdAt":"2026-10-23T07:41:45.842813692Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-02b09b65-fe7c-4ac8-8e66-d1c39d8fe346

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02b09b65-fe7c-4ac8-8e66-d1c39d8fe346
Content-Type: application/json

--- request body ---
{"handle":"qa-eea7ea03a9d4","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-02b09b65-fe7c-4ac8-8e66-d1c39d8fe346
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72e292ee-b1aa-486c-9283-381dcde6e7ff"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-9eab2e14-4a38-4b22-bc78-79a9b2ae5671

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-9eab2e14-4a38-4b22-bc78-79a9b2ae5671
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9eab2e14-4a38-4b22-bc78-79a9b2ae5671
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: in
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 181

{"id":"acc_72e292ee-b1aa-486c-9283-381dcde6e7ff","handle":"qa-eea7ea03a9d4","displayName":"QA eea7ea03a9d4","region":"us","role":"user","createdAt":"2026-10-23T07:41:45.842813692Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2b34294-22d9-4329-bd93-28ef03c87d07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2b34294-22d9-4329-bd93-28ef03c87d07
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2b34294-22d9-4329-bd93-28ef03c87d07
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
X-Served-Region: us
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-da422edc-97f0-4679-9c11-0fbadc321637

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da422edc-97f0-4679-9c11-0fbadc321637
Content-Type: application/json

--- request body ---
{"handle":"qa-eea7ea03a9d4","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da422edc-97f0-4679-9c11-0fbadc321637
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-da422edc-97f0-4679-9c11-0fbadc321637"}
```
