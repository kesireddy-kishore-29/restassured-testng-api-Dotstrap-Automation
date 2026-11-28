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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-642f643c-5c75-48a4-a653-593891a6058e` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-766e641a-82dc-4033-bd49-5ce8103fe5c1` |
| 3 | `GET /v1/accounts/me` | error | 814 | `qa-e1f5556f-ba8d-476d-813d-0c647e702289` |
| 4 | `GET /v1/accounts/me` | error | 804 | `qa-7e882300-5313-45fd-8372-368dd6ae0039` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-18b422cb-e82c-4081-93b9-fc01c65fc846` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-f7320649-7ad9-4fbe-b5b7-e47764f1a3d4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-642f643c-5c75-48a4-a653-593891a6058e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-642f643c-5c75-48a4-a653-593891a6058e
Content-Type: application/json

--- request body ---
{"handle":"qa-fd4e6a558e86","displayName":"QA fd4e6a558e86","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-642f643c-5c75-48a4-a653-593891a6058e
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
Location: /v1/accounts/qa-fd4e6a558e86
X-Served-Region: eu
Content-Length: 181

{"id":"acc_21317171-b1a2-4f01-82c8-52da14206fad","handle":"qa-fd4e6a558e86","displayName":"QA fd4e6a558e86","region":"eu","role":"user","createdAt":"2026-11-24T12:37:59.632480154Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-766e641a-82dc-4033-bd49-5ce8103fe5c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-766e641a-82dc-4033-bd49-5ce8103fe5c1
Content-Type: application/json

--- request body ---
{"handle":"qa-fd4e6a558e86","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-766e641a-82dc-4033-bd49-5ce8103fe5c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21317171-b1a2-4f01-82c8-52da14206fad"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-e1f5556f-ba8d-476d-813d-0c647e702289

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: e5aa38bd-7f1c-4dd0-9ba8-9f1a26219a11
X-Correlation-Id: qa-e1f5556f-ba8d-476d-813d-0c647e702289
Content-Type: application/json

--- response: none in 814 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e882300-5313-45fd-8372-368dd6ae0039

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: e5aa38bd-7f1c-4dd0-9ba8-9f1a26219a11
X-Correlation-Id: qa-7e882300-5313-45fd-8372-368dd6ae0039
Content-Type: application/json

--- response: none in 804 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-18b422cb-e82c-4081-93b9-fc01c65fc846

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18b422cb-e82c-4081-93b9-fc01c65fc846
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-18b422cb-e82c-4081-93b9-fc01c65fc846
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
correlation: qa-f7320649-7ad9-4fbe-b5b7-e47764f1a3d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7320649-7ad9-4fbe-b5b7-e47764f1a3d4
Content-Type: application/json

--- request body ---
{"handle":"qa-fd4e6a558e86","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7320649-7ad9-4fbe-b5b7-e47764f1a3d4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7320649-7ad9-4fbe-b5b7-e47764f1a3d4"}
```
