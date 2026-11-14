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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-9463b5a5-e657-461c-b47b-99f1cd3c4339` |
| 2 | `POST /v1/auth/token` | 200 | 24 | `qa-ef8f44b4-124d-4752-a6cd-03ba30196ae9` |
| 3 | `GET /v1/accounts/me` | 200 | 21 | `qa-88ca8fdc-88a0-44dc-87fe-0ed8b7567e19` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-080d9125-ed74-4115-bc63-d000f55817ea` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-4f5658de-f00b-4a27-a347-f88039bafb96` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9463b5a5-e657-461c-b47b-99f1cd3c4339

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9463b5a5-e657-461c-b47b-99f1cd3c4339
Content-Type: application/json

--- request body ---
{"handle":"qa-51791d519bbe","displayName":"QA 51791d519bbe","password":"****","region":"in"}

--- response: 201 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9463b5a5-e657-461c-b47b-99f1cd3c4339
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
Location: /v1/accounts/qa-51791d519bbe
X-Served-Region: in
Content-Length: 181

{"id":"acc_ca323b4e-4e24-43d1-ba77-f8d1bf1d1e48","handle":"qa-51791d519bbe","displayName":"QA 51791d519bbe","region":"in","role":"user","createdAt":"2026-11-11T09:34:32.350484369Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ef8f44b4-124d-4752-a6cd-03ba30196ae9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef8f44b4-124d-4752-a6cd-03ba30196ae9
Content-Type: application/json

--- request body ---
{"handle":"qa-51791d519bbe","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef8f44b4-124d-4752-a6cd-03ba30196ae9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ca323b4e-4e24-43d1-ba77-f8d1bf1d1e48"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-88ca8fdc-88a0-44dc-87fe-0ed8b7567e19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88ca8fdc-88a0-44dc-87fe-0ed8b7567e19
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-88ca8fdc-88a0-44dc-87fe-0ed8b7567e19
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

{"id":"acc_ca323b4e-4e24-43d1-ba77-f8d1bf1d1e48","handle":"qa-51791d519bbe","displayName":"QA 51791d519bbe","region":"in","role":"user","createdAt":"2026-11-11T09:34:32.350484369Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-080d9125-ed74-4115-bc63-d000f55817ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-080d9125-ed74-4115-bc63-d000f55817ea
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-080d9125-ed74-4115-bc63-d000f55817ea
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
correlation: qa-4f5658de-f00b-4a27-a347-f88039bafb96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f5658de-f00b-4a27-a347-f88039bafb96
Content-Type: application/json

--- request body ---
{"handle":"qa-51791d519bbe","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f5658de-f00b-4a27-a347-f88039bafb96
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f5658de-f00b-4a27-a347-f88039bafb96"}
```
