# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-617d6d7a-e27e-46e5-adee-f6fbcdbe67c7` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-0b225353-23b6-4d10-b5ca-d3e216593fb4` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-1f04a9b6-3afd-4997-8191-6904a012190d` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-50358e42-42f1-403f-8e6e-e7a650e940c8` |
| 5 | `POST /v1/accounts` | 415 | 32 | `qa-f60632d8-9784-4702-bfca-018c75a2e0a1` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-00f88990-482e-49e0-b419-2611e0a4a987` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-13d5b0ba-3f82-465a-8010-7ea1b4413fd0` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-86979690-7653-48be-8ba3-5b8a641bac2f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-7b7cba00-201a-4ecf-bde9-140f5cf90cb2` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-bd4b489a-5933-498c-9f81-0a8596181971` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-617d6d7a-e27e-46e5-adee-f6fbcdbe67c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-617d6d7a-e27e-46e5-adee-f6fbcdbe67c7
Content-Type: application/json

--- request body ---
{"handle":"qa-06a11eb38ddc","displayName":"QA 06a11eb38ddc","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-617d6d7a-e27e-46e5-adee-f6fbcdbe67c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Location: /v1/accounts/qa-06a11eb38ddc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d84ff43f-175d-4c1b-aa0a-9a6df17b218e","handle":"qa-06a11eb38ddc","displayName":"QA 06a11eb38ddc","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.549564089Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0b225353-23b6-4d10-b5ca-d3e216593fb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b225353-23b6-4d10-b5ca-d3e216593fb4
Content-Type: application/json

--- request body ---
{"handle":"qa-08170c54de87","displayName":"QA 08170c54de87","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b225353-23b6-4d10-b5ca-d3e216593fb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Location: /v1/accounts/qa-08170c54de87
X-Served-Region: eu
Content-Length: 181

{"id":"acc_90070cee-a492-4d4d-81b2-ad88dbdff066","handle":"qa-08170c54de87","displayName":"QA 08170c54de87","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.610333605Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1f04a9b6-3afd-4997-8191-6904a012190d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f04a9b6-3afd-4997-8191-6904a012190d
Content-Type: application/json

--- request body ---
{"handle":"qa-06a11eb38ddc","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f04a9b6-3afd-4997-8191-6904a012190d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d84ff43f-175d-4c1b-aa0a-9a6df17b218e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-50358e42-42f1-403f-8e6e-e7a650e940c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50358e42-42f1-403f-8e6e-e7a650e940c8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-08170c54de87","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-50358e42-42f1-403f-8e6e-e7a650e940c8
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
Location: /v1/conversations/cnv_11a20d63-2c46-49aa-a202-00f7a3fcd240
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_11a20d63-2c46-49aa-a202-00f7a3fcd240","subject":"Error contract","status":"open","region":"eu","participants":["qa-06a11eb38ddc","qa-08170c54de87"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:14.683540475Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-f60632d8-9784-4702-bfca-018c75a2e0a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f60632d8-9784-4702-bfca-018c75a2e0a1
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 32 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f60632d8-9784-4702-bfca-018c75a2e0a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-f60632d8-9784-4702-bfca-018c75a2e0a1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-00f88990-482e-49e0-b419-2611e0a4a987

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00f88990-482e-49e0-b419-2611e0a4a987
Content-Type: application/json

--- request body ---
{"handle":"qa-08170c54de87","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-00f88990-482e-49e0-b419-2611e0a4a987
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_90070cee-a492-4d4d-81b2-ad88dbdff066"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-13d5b0ba-3f82-465a-8010-7ea1b4413fd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13d5b0ba-3f82-465a-8010-7ea1b4413fd0
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-13d5b0ba-3f82-465a-8010-7ea1b4413fd0
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-86979690-7653-48be-8ba3-5b8a641bac2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86979690-7653-48be-8ba3-5b8a641bac2f
Content-Type: application/json

--- request body ---
{"handle":"qa-08170c54de87","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86979690-7653-48be-8ba3-5b8a641bac2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-86979690-7653-48be-8ba3-5b8a641bac2f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7b7cba00-201a-4ecf-bde9-140f5cf90cb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b7cba00-201a-4ecf-bde9-140f5cf90cb2
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7b7cba00-201a-4ecf-bde9-140f5cf90cb2
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-bd4b489a-5933-498c-9f81-0a8596181971

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd4b489a-5933-498c-9f81-0a8596181971
Content-Type: application/json

--- request body ---
{"handle":"qa-06a11eb38ddc","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd4b489a-5933-498c-9f81-0a8596181971
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd4b489a-5933-498c-9f81-0a8596181971"}
```
