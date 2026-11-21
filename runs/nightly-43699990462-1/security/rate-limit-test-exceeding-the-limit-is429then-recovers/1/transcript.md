# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 82 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 484 | `qa-a31d723c-1ec7-4f43-a915-065d51e78e79` |
| 2 | `POST /v1/auth/token` | 200 | 71 | `qa-a81032f9-1b54-4d2b-8536-366d619acfe7` |
| 3 | `GET /v1/accounts/me` | 200 | 48 | `qa-c38ff3ab-3762-4b16-a64b-65607b6044ea` |
| 4 | `GET /v1/accounts/me` | 200 | 26 | `qa-36dff22e-dd97-4811-9b7e-747f58838e73` |
| 5 | `GET /v1/accounts/me` | 200 | 17 | `qa-77c0f1d0-ed04-4e5b-84be-fa1808903a5d` |
| 6 | `GET /v1/accounts/me` | 200 | 9 | `qa-3d4dcc67-e9bf-436c-bb08-3ed1f20465d8` |
| 7 | `GET /v1/accounts/me` | 200 | 8 | `qa-dea608a6-edd8-4f56-9019-423ac9d959b7` |
| 8 | `GET /v1/accounts/me` | 200 | 18 | `qa-894fa939-917c-43cf-ac80-b4f3ea76acd7` |
| 9 | `GET /v1/accounts/me` | 200 | 17 | `qa-32cde67a-5e25-4cd2-9e88-41b99aa9ca12` |
| 10 | `GET /v1/accounts/me` | 200 | 8 | `qa-0231ece7-6a94-450a-bd38-eb7572fcb692` |
| 11 | `GET /v1/accounts/me` | 200 | 7 | `qa-b60d6d10-2ac8-462d-840d-27c1aff1c192` |
| 12 | `GET /v1/accounts/me` | 200 | 12 | `qa-59ef8aad-d2d4-4e18-bf7f-b9b51ed82303` |
| 13 | `GET /v1/accounts/me` | 200 | 10 | `qa-175aa936-5476-4e3f-b6c1-63ee5d872b34` |
| 14 | `GET /v1/accounts/me` | 200 | 11 | `qa-e125c36b-c12f-479e-b7a7-0f238e6329e0` |
| 15 | `GET /v1/accounts/me` | 200 | 17 | `qa-b20a25e8-aaf2-4189-b567-bceb4bc89d54` |
| 16 | `GET /v1/accounts/me` | 200 | 13 | `qa-7e79672c-ffca-4250-9682-ff077eec613c` |
| 17 | `GET /v1/accounts/me` | 200 | 11 | `qa-047ad03b-6c24-4a80-af42-9ed6d21c9583` |
| 18 | `GET /v1/accounts/me` | 200 | 14 | `qa-e73a0d77-4a4f-48e1-85bc-048d9d5392d9` |
| 19 | `GET /v1/accounts/me` | 200 | 8 | `qa-9b888329-87c3-43d0-b318-c92b6f178389` |
| 20 | `GET /v1/accounts/me` | 200 | 11 | `qa-b55406c4-9156-4512-860d-53abf0fb4d2f` |
| 21 | `GET /v1/accounts/me` | 200 | 14 | `qa-6ba7d533-e717-4754-adcf-6fa3e11005db` |
| 22 | `GET /v1/accounts/me` | 200 | 7 | `qa-57d57fa4-4525-461d-b74f-e2f76a75651e` |
| 23 | `GET /v1/accounts/me` | 200 | 13 | `qa-3d8151aa-451d-4975-bd50-420efdde9878` |
| 24 | `GET /v1/accounts/me` | 200 | 9 | `qa-ea782e57-ee56-4df6-ba7f-e8fc8c92da40` |
| 25 | `GET /v1/accounts/me` | 200 | 10 | `qa-79e9b381-2284-44f5-852d-ccf7522fdd42` |
| 26 | `GET /v1/accounts/me` | 200 | 7 | `qa-f74fc9dc-cc19-4187-a16c-e65f460bc2ab` |
| 27 | `GET /v1/accounts/me` | 200 | 6 | `qa-0bbbd763-118a-4648-9d2b-31895bf5aba1` |
| 28 | `GET /v1/accounts/me` | 200 | 10 | `qa-b07176ca-5e88-4ad5-9d2d-f524a333cf84` |
| 29 | `GET /v1/accounts/me` | 200 | 10 | `qa-597dd59b-09f8-4df2-8e68-0d263af93c2c` |
| 30 | `GET /v1/accounts/me` | 200 | 7 | `qa-5252e8cf-667c-4f7e-89d4-a8d8ec239041` |
| 31 | `GET /v1/accounts/me` | 200 | 12 | `qa-6ee00168-0f78-476b-abc5-6acdc9f061cd` |
| 32 | `GET /v1/accounts/me` | 200 | 12 | `qa-9cf10d40-da42-4baa-bd48-18870cd348d0` |
| 33 | `GET /v1/accounts/me` | 200 | 10 | `qa-91bd6c60-ab4c-4baf-b027-07c2675a69ca` |
| 34 | `GET /v1/accounts/me` | 200 | 8 | `qa-3ab1a32b-ad0f-4b3a-86c1-3d6bedd1979e` |
| 35 | `GET /v1/accounts/me` | 200 | 11 | `qa-9a9631ad-20f5-4e21-9081-f95a03bca4bb` |
| 36 | `GET /v1/accounts/me` | 200 | 6 | `qa-76c4fe5e-2cf3-4267-94b8-bc0b9c1cd66c` |
| 37 | `GET /v1/accounts/me` | 200 | 6 | `qa-25838761-3010-49de-99b7-27d64fabe06c` |
| 38 | `GET /v1/accounts/me` | 200 | 5 | `qa-48d9eb41-60e8-4125-a257-7a9892ce0306` |
| 39 | `GET /v1/accounts/me` | 200 | 14 | `qa-05913120-d4dc-455f-b83c-f1f7e40d2c4e` |
| 40 | `GET /v1/accounts/me` | 200 | 9 | `qa-64be61ca-2578-4772-8fa3-1e21e8aa1991` |
| 41 | `GET /v1/accounts/me` | 200 | 8 | `qa-f53bfb12-2d0f-49b2-ad2d-1fc8fd64d920` |
| 42 | `GET /v1/accounts/me` | 200 | 6 | `qa-4bdb6e32-f782-4adf-ad5e-178c22495a2c` |
| 43 | `GET /v1/accounts/me` | 200 | 6 | `qa-573c1c7f-f987-4e08-a517-6dec6dac5cdc` |
| 44 | `GET /v1/accounts/me` | 200 | 7 | `qa-3ab01eb0-f976-4aff-9d3b-7459ccff8f45` |
| 45 | `GET /v1/accounts/me` | 200 | 14 | `qa-5523d696-e552-49f2-a321-9ac46fb2243a` |
| 46 | `GET /v1/accounts/me` | 200 | 11 | `qa-7c5a5b59-32cc-44f9-99a8-5cf6658e6046` |
| 47 | `GET /v1/accounts/me` | 200 | 9 | `qa-10342b4b-c1b5-4137-9dcf-7a364a8c8cb0` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-83ee5b89-78c6-4176-81f1-5d56cfaba92a` |
| 49 | `GET /v1/accounts/me` | 200 | 9 | `qa-dba43b0d-2de0-4476-9d9e-1599e63dd05c` |
| 50 | `GET /v1/accounts/me` | 200 | 6 | `qa-abc50e4a-66c1-49ac-a3af-75bfe867b9f6` |
| 51 | `GET /v1/accounts/me` | 200 | 8 | `qa-b8804db5-728c-4284-a370-06f6cf71d00f` |
| 52 | `GET /v1/accounts/me` | 200 | 8 | `qa-3a60ef31-3c7c-45bd-a366-b44c64a4a792` |
| 53 | `GET /v1/accounts/me` | 200 | 6 | `qa-ff99506e-c049-42ea-9da1-dd3f974d7b6b` |
| 54 | `GET /v1/accounts/me` | 200 | 11 | `qa-f0ac53e0-f3f6-493a-b721-041e32bd1526` |
| 55 | `GET /v1/accounts/me` | 200 | 8 | `qa-cc754ca2-d87f-463a-a876-7f6a4a3d4c7d` |
| 56 | `GET /v1/accounts/me` | 200 | 7 | `qa-32c9ce84-5c7d-410a-95ce-b6eb5250930a` |
| 57 | `GET /v1/accounts/me` | 200 | 5 | `qa-0c919dfb-44a9-47e5-8d02-c527f5445c5a` |
| 58 | `GET /v1/accounts/me` | 200 | 7 | `qa-bd0d870e-95a6-4be9-a247-59e1790c9d05` |
| 59 | `GET /v1/accounts/me` | 200 | 21 | `qa-92c8f104-af91-48da-8692-47f6215bbca3` |
| 60 | `GET /v1/accounts/me` | 200 | 9 | `qa-e4964acf-0c1e-4347-a5e3-02d92b8e14c1` |
| 61 | `GET /v1/accounts/me` | 200 | 9 | `qa-74e4a3f9-3fc6-4db1-87c9-1f457a886924` |
| 62 | `GET /v1/accounts/me` | 200 | 7 | `qa-4487d8f5-c5f1-488b-bf4d-84116863615c` |
| 63 | `GET /v1/accounts/me` | 429 | 7 | `qa-6da199f6-a147-4448-84bd-c72234ebd1ba` |
| 64 | `GET /v1/accounts/me` | 429 | 8 | `qa-27b9bae6-fcec-4a1b-84b2-4c21cb0957e9` |
| 65 | `GET /v1/accounts/me` | 429 | 8 | `qa-daceffb7-090f-4da1-ac34-d084716a378e` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-4178e71e-6179-469f-9a70-545e34e40886` |
| 67 | `GET /v1/accounts/me` | 429 | 7 | `qa-9882d736-7016-46e2-9de8-61a78353c1da` |
| 68 | `GET /v1/accounts/me` | 429 | 6 | `qa-ea6400ae-a11b-44a8-b6eb-81803625a8c7` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-ee72fa03-743f-4d02-bb5f-e8070dc08ca5` |
| 70 | `GET /v1/accounts/me` | 429 | 5 | `qa-fa24f104-5215-4ee5-afcd-d6de62b33623` |
| 71 | `GET /v1/accounts/me` | 429 | 5 | `qa-62c5f415-bc16-450b-b3da-489302dcf329` |
| 72 | `GET /v1/accounts/me` | 429 | 5 | `qa-02d912ad-bb8b-437b-9f7f-a95137130393` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-4af3ffb8-7bbc-4f78-986f-8b8f42513266` |
| 74 | `GET /v1/accounts/me` | 429 | 5 | `qa-f23ddbc4-2b38-4cd4-b5cb-f7c305737621` |
| 75 | `GET /v1/accounts/me` | 429 | 6 | `qa-6aee9056-8672-4566-83d0-ab721158783b` |
| 76 | `GET /v1/accounts/me` | 429 | 5 | `qa-395689b1-3d1c-49d9-8679-0aaa5cb7f30b` |
| 77 | `GET /v1/accounts/me` | 429 | 5 | `qa-f260e1bb-49a1-410c-a006-e8c9a2e8bdf2` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-17fc89cb-b306-4153-b6a0-d4b7c37aa4f7` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-fd19f9fa-62cd-4dcf-99e9-fb873a5e35d8` |
| 80 | `GET /v1/accounts/me` | 200 | 4 | `qa-58b1730e-7b19-4c6c-9402-5f5a7cd48780` |
| 81 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-a3b9e362-2e96-44ea-b8c5-c58f01a31e56` |
| 82 | `POST /v1/auth/token` | 401 | 5 | `qa-1755350a-7fe5-4eb4-ab8a-993456be2262` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a31d723c-1ec7-4f43-a915-065d51e78e79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a31d723c-1ec7-4f43-a915-065d51e78e79
Content-Type: application/json

--- request body ---
{"handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","password":"****","region":"eu"}

--- response: 201 in 484 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a31d723c-1ec7-4f43-a915-065d51e78e79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-8033b7bbd188
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a81032f9-1b54-4d2b-8536-366d619acfe7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a81032f9-1b54-4d2b-8536-366d619acfe7
Content-Type: application/json

--- request body ---
{"handle":"qa-8033b7bbd188","password":"****"}

--- response: 200 in 71 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-a81032f9-1b54-4d2b-8536-366d619acfe7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-c38ff3ab-3762-4b16-a64b-65607b6044ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c38ff3ab-3762-4b16-a64b-65607b6044ea
Content-Type: application/json

--- response: 200 in 48 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-c38ff3ab-3762-4b16-a64b-65607b6044ea
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
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-36dff22e-dd97-4811-9b7e-747f58838e73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36dff22e-dd97-4811-9b7e-747f58838e73
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-36dff22e-dd97-4811-9b7e-747f58838e73
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
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-77c0f1d0-ed04-4e5b-84be-fa1808903a5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77c0f1d0-ed04-4e5b-84be-fa1808903a5d
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-77c0f1d0-ed04-4e5b-84be-fa1808903a5d
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
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d4dcc67-e9bf-436c-bb08-3ed1f20465d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d4dcc67-e9bf-436c-bb08-3ed1f20465d8
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d4dcc67-e9bf-436c-bb08-3ed1f20465d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-dea608a6-edd8-4f56-9019-423ac9d959b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dea608a6-edd8-4f56-9019-423ac9d959b7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-dea608a6-edd8-4f56-9019-423ac9d959b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-894fa939-917c-43cf-ac80-b4f3ea76acd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-894fa939-917c-43cf-ac80-b4f3ea76acd7
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-894fa939-917c-43cf-ac80-b4f3ea76acd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-32cde67a-5e25-4cd2-9e88-41b99aa9ca12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32cde67a-5e25-4cd2-9e88-41b99aa9ca12
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-32cde67a-5e25-4cd2-9e88-41b99aa9ca12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-0231ece7-6a94-450a-bd38-eb7572fcb692

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0231ece7-6a94-450a-bd38-eb7572fcb692
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0231ece7-6a94-450a-bd38-eb7572fcb692
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-b60d6d10-2ac8-462d-840d-27c1aff1c192

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b60d6d10-2ac8-462d-840d-27c1aff1c192
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-b60d6d10-2ac8-462d-840d-27c1aff1c192
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-59ef8aad-d2d4-4e18-bf7f-b9b51ed82303

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59ef8aad-d2d4-4e18-bf7f-b9b51ed82303
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-59ef8aad-d2d4-4e18-bf7f-b9b51ed82303
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-175aa936-5476-4e3f-b6c1-63ee5d872b34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-175aa936-5476-4e3f-b6c1-63ee5d872b34
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-175aa936-5476-4e3f-b6c1-63ee5d872b34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-e125c36b-c12f-479e-b7a7-0f238e6329e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e125c36b-c12f-479e-b7a7-0f238e6329e0
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e125c36b-c12f-479e-b7a7-0f238e6329e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-b20a25e8-aaf2-4189-b567-bceb4bc89d54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b20a25e8-aaf2-4189-b567-bceb4bc89d54
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-b20a25e8-aaf2-4189-b567-bceb4bc89d54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e79672c-ffca-4250-9682-ff077eec613c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e79672c-ffca-4250-9682-ff077eec613c
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e79672c-ffca-4250-9682-ff077eec613c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-047ad03b-6c24-4a80-af42-9ed6d21c9583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-047ad03b-6c24-4a80-af42-9ed6d21c9583
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-047ad03b-6c24-4a80-af42-9ed6d21c9583
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-e73a0d77-4a4f-48e1-85bc-048d9d5392d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e73a0d77-4a4f-48e1-85bc-048d9d5392d9
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e73a0d77-4a4f-48e1-85bc-048d9d5392d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b888329-87c3-43d0-b318-c92b6f178389

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b888329-87c3-43d0-b318-c92b6f178389
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b888329-87c3-43d0-b318-c92b6f178389
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-b55406c4-9156-4512-860d-53abf0fb4d2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b55406c4-9156-4512-860d-53abf0fb4d2f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-b55406c4-9156-4512-860d-53abf0fb4d2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ba7d533-e717-4754-adcf-6fa3e11005db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ba7d533-e717-4754-adcf-6fa3e11005db
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ba7d533-e717-4754-adcf-6fa3e11005db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-57d57fa4-4525-461d-b74f-e2f76a75651e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57d57fa4-4525-461d-b74f-e2f76a75651e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-57d57fa4-4525-461d-b74f-e2f76a75651e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d8151aa-451d-4975-bd50-420efdde9878

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d8151aa-451d-4975-bd50-420efdde9878
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d8151aa-451d-4975-bd50-420efdde9878
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea782e57-ee56-4df6-ba7f-e8fc8c92da40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea782e57-ee56-4df6-ba7f-e8fc8c92da40
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea782e57-ee56-4df6-ba7f-e8fc8c92da40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-79e9b381-2284-44f5-852d-ccf7522fdd42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79e9b381-2284-44f5-852d-ccf7522fdd42
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-79e9b381-2284-44f5-852d-ccf7522fdd42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-f74fc9dc-cc19-4187-a16c-e65f460bc2ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f74fc9dc-cc19-4187-a16c-e65f460bc2ab
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-f74fc9dc-cc19-4187-a16c-e65f460bc2ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-0bbbd763-118a-4648-9d2b-31895bf5aba1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bbbd763-118a-4648-9d2b-31895bf5aba1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bbbd763-118a-4648-9d2b-31895bf5aba1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-b07176ca-5e88-4ad5-9d2d-f524a333cf84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b07176ca-5e88-4ad5-9d2d-f524a333cf84
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-b07176ca-5e88-4ad5-9d2d-f524a333cf84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-597dd59b-09f8-4df2-8e68-0d263af93c2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-597dd59b-09f8-4df2-8e68-0d263af93c2c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-597dd59b-09f8-4df2-8e68-0d263af93c2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-5252e8cf-667c-4f7e-89d4-a8d8ec239041

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5252e8cf-667c-4f7e-89d4-a8d8ec239041
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-5252e8cf-667c-4f7e-89d4-a8d8ec239041
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ee00168-0f78-476b-abc5-6acdc9f061cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ee00168-0f78-476b-abc5-6acdc9f061cd
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ee00168-0f78-476b-abc5-6acdc9f061cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-9cf10d40-da42-4baa-bd48-18870cd348d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cf10d40-da42-4baa-bd48-18870cd348d0
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cf10d40-da42-4baa-bd48-18870cd348d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-91bd6c60-ab4c-4baf-b027-07c2675a69ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91bd6c60-ab4c-4baf-b027-07c2675a69ca
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-91bd6c60-ab4c-4baf-b027-07c2675a69ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-3ab1a32b-ad0f-4b3a-86c1-3d6bedd1979e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ab1a32b-ad0f-4b3a-86c1-3d6bedd1979e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ab1a32b-ad0f-4b3a-86c1-3d6bedd1979e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-9a9631ad-20f5-4e21-9081-f95a03bca4bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a9631ad-20f5-4e21-9081-f95a03bca4bb
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a9631ad-20f5-4e21-9081-f95a03bca4bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-76c4fe5e-2cf3-4267-94b8-bc0b9c1cd66c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76c4fe5e-2cf3-4267-94b8-bc0b9c1cd66c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-76c4fe5e-2cf3-4267-94b8-bc0b9c1cd66c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-25838761-3010-49de-99b7-27d64fabe06c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25838761-3010-49de-99b7-27d64fabe06c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-25838761-3010-49de-99b7-27d64fabe06c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-48d9eb41-60e8-4125-a257-7a9892ce0306

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48d9eb41-60e8-4125-a257-7a9892ce0306
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-48d9eb41-60e8-4125-a257-7a9892ce0306
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-05913120-d4dc-455f-b83c-f1f7e40d2c4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05913120-d4dc-455f-b83c-f1f7e40d2c4e
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-05913120-d4dc-455f-b83c-f1f7e40d2c4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-64be61ca-2578-4772-8fa3-1e21e8aa1991

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64be61ca-2578-4772-8fa3-1e21e8aa1991
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-64be61ca-2578-4772-8fa3-1e21e8aa1991
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-f53bfb12-2d0f-49b2-ad2d-1fc8fd64d920

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f53bfb12-2d0f-49b2-ad2d-1fc8fd64d920
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-f53bfb12-2d0f-49b2-ad2d-1fc8fd64d920
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-4bdb6e32-f782-4adf-ad5e-178c22495a2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bdb6e32-f782-4adf-ad5e-178c22495a2c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bdb6e32-f782-4adf-ad5e-178c22495a2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-573c1c7f-f987-4e08-a517-6dec6dac5cdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-573c1c7f-f987-4e08-a517-6dec6dac5cdc
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-573c1c7f-f987-4e08-a517-6dec6dac5cdc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-3ab01eb0-f976-4aff-9d3b-7459ccff8f45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ab01eb0-f976-4aff-9d3b-7459ccff8f45
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ab01eb0-f976-4aff-9d3b-7459ccff8f45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-5523d696-e552-49f2-a321-9ac46fb2243a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5523d696-e552-49f2-a321-9ac46fb2243a
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5523d696-e552-49f2-a321-9ac46fb2243a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c5a5b59-32cc-44f9-99a8-5cf6658e6046

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c5a5b59-32cc-44f9-99a8-5cf6658e6046
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c5a5b59-32cc-44f9-99a8-5cf6658e6046
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-10342b4b-c1b5-4137-9dcf-7a364a8c8cb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10342b4b-c1b5-4137-9dcf-7a364a8c8cb0
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-10342b4b-c1b5-4137-9dcf-7a364a8c8cb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-83ee5b89-78c6-4176-81f1-5d56cfaba92a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83ee5b89-78c6-4176-81f1-5d56cfaba92a
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-83ee5b89-78c6-4176-81f1-5d56cfaba92a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-dba43b0d-2de0-4476-9d9e-1599e63dd05c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dba43b0d-2de0-4476-9d9e-1599e63dd05c
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-dba43b0d-2de0-4476-9d9e-1599e63dd05c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-abc50e4a-66c1-49ac-a3af-75bfe867b9f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abc50e4a-66c1-49ac-a3af-75bfe867b9f6
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-abc50e4a-66c1-49ac-a3af-75bfe867b9f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8804db5-728c-4284-a370-06f6cf71d00f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8804db5-728c-4284-a370-06f6cf71d00f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8804db5-728c-4284-a370-06f6cf71d00f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a60ef31-3c7c-45bd-a366-b44c64a4a792

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a60ef31-3c7c-45bd-a366-b44c64a4a792
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a60ef31-3c7c-45bd-a366-b44c64a4a792
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff99506e-c049-42ea-9da1-dd3f974d7b6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff99506e-c049-42ea-9da1-dd3f974d7b6b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff99506e-c049-42ea-9da1-dd3f974d7b6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-f0ac53e0-f3f6-493a-b721-041e32bd1526

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0ac53e0-f3f6-493a-b721-041e32bd1526
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0ac53e0-f3f6-493a-b721-041e32bd1526
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc754ca2-d87f-463a-a876-7f6a4a3d4c7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc754ca2-d87f-463a-a876-7f6a4a3d4c7d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc754ca2-d87f-463a-a876-7f6a4a3d4c7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-32c9ce84-5c7d-410a-95ce-b6eb5250930a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32c9ce84-5c7d-410a-95ce-b6eb5250930a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-32c9ce84-5c7d-410a-95ce-b6eb5250930a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-0c919dfb-44a9-47e5-8d02-c527f5445c5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c919dfb-44a9-47e5-8d02-c527f5445c5a
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c919dfb-44a9-47e5-8d02-c527f5445c5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd0d870e-95a6-4be9-a247-59e1790c9d05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd0d870e-95a6-4be9-a247-59e1790c9d05
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd0d870e-95a6-4be9-a247-59e1790c9d05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-92c8f104-af91-48da-8692-47f6215bbca3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92c8f104-af91-48da-8692-47f6215bbca3
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-92c8f104-af91-48da-8692-47f6215bbca3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-e4964acf-0c1e-4347-a5e3-02d92b8e14c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4964acf-0c1e-4347-a5e3-02d92b8e14c1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4964acf-0c1e-4347-a5e3-02d92b8e14c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-74e4a3f9-3fc6-4db1-87c9-1f457a886924

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74e4a3f9-3fc6-4db1-87c9-1f457a886924
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-74e4a3f9-3fc6-4db1-87c9-1f457a886924
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-4487d8f5-c5f1-488b-bf4d-84116863615c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4487d8f5-c5f1-488b-bf4d-84116863615c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-4487d8f5-c5f1-488b-bf4d-84116863615c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-6da199f6-a147-4448-84bd-c72234ebd1ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6da199f6-a147-4448-84bd-c72234ebd1ba
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6da199f6-a147-4448-84bd-c72234ebd1ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6da199f6-a147-4448-84bd-c72234ebd1ba"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-27b9bae6-fcec-4a1b-84b2-4c21cb0957e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27b9bae6-fcec-4a1b-84b2-4c21cb0957e9
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27b9bae6-fcec-4a1b-84b2-4c21cb0957e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-27b9bae6-fcec-4a1b-84b2-4c21cb0957e9"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-daceffb7-090f-4da1-ac34-d084716a378e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daceffb7-090f-4da1-ac34-d084716a378e
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-daceffb7-090f-4da1-ac34-d084716a378e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-daceffb7-090f-4da1-ac34-d084716a378e"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-4178e71e-6179-469f-9a70-545e34e40886

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4178e71e-6179-469f-9a70-545e34e40886
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4178e71e-6179-469f-9a70-545e34e40886
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4178e71e-6179-469f-9a70-545e34e40886"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-9882d736-7016-46e2-9de8-61a78353c1da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9882d736-7016-46e2-9de8-61a78353c1da
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9882d736-7016-46e2-9de8-61a78353c1da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9882d736-7016-46e2-9de8-61a78353c1da"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea6400ae-a11b-44a8-b6eb-81803625a8c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea6400ae-a11b-44a8-b6eb-81803625a8c7
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea6400ae-a11b-44a8-b6eb-81803625a8c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ea6400ae-a11b-44a8-b6eb-81803625a8c7"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee72fa03-743f-4d02-bb5f-e8070dc08ca5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee72fa03-743f-4d02-bb5f-e8070dc08ca5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee72fa03-743f-4d02-bb5f-e8070dc08ca5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ee72fa03-743f-4d02-bb5f-e8070dc08ca5"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-fa24f104-5215-4ee5-afcd-d6de62b33623

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa24f104-5215-4ee5-afcd-d6de62b33623
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa24f104-5215-4ee5-afcd-d6de62b33623
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fa24f104-5215-4ee5-afcd-d6de62b33623"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-62c5f415-bc16-450b-b3da-489302dcf329

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62c5f415-bc16-450b-b3da-489302dcf329
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62c5f415-bc16-450b-b3da-489302dcf329
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-62c5f415-bc16-450b-b3da-489302dcf329"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-02d912ad-bb8b-437b-9f7f-a95137130393

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02d912ad-bb8b-437b-9f7f-a95137130393
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02d912ad-bb8b-437b-9f7f-a95137130393
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-02d912ad-bb8b-437b-9f7f-a95137130393"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-4af3ffb8-7bbc-4f78-986f-8b8f42513266

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4af3ffb8-7bbc-4f78-986f-8b8f42513266
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4af3ffb8-7bbc-4f78-986f-8b8f42513266
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4af3ffb8-7bbc-4f78-986f-8b8f42513266"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-f23ddbc4-2b38-4cd4-b5cb-f7c305737621

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f23ddbc4-2b38-4cd4-b5cb-f7c305737621
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f23ddbc4-2b38-4cd4-b5cb-f7c305737621
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f23ddbc4-2b38-4cd4-b5cb-f7c305737621"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-6aee9056-8672-4566-83d0-ab721158783b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6aee9056-8672-4566-83d0-ab721158783b
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6aee9056-8672-4566-83d0-ab721158783b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6aee9056-8672-4566-83d0-ab721158783b"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-395689b1-3d1c-49d9-8679-0aaa5cb7f30b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-395689b1-3d1c-49d9-8679-0aaa5cb7f30b
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-395689b1-3d1c-49d9-8679-0aaa5cb7f30b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-395689b1-3d1c-49d9-8679-0aaa5cb7f30b"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-f260e1bb-49a1-410c-a006-e8c9a2e8bdf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f260e1bb-49a1-410c-a006-e8c9a2e8bdf2
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f260e1bb-49a1-410c-a006-e8c9a2e8bdf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f260e1bb-49a1-410c-a006-e8c9a2e8bdf2"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-17fc89cb-b306-4153-b6a0-d4b7c37aa4f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17fc89cb-b306-4153-b6a0-d4b7c37aa4f7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17fc89cb-b306-4153-b6a0-d4b7c37aa4f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-17fc89cb-b306-4153-b6a0-d4b7c37aa4f7"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd19f9fa-62cd-4dcf-99e9-fb873a5e35d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd19f9fa-62cd-4dcf-99e9-fb873a5e35d8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd19f9fa-62cd-4dcf-99e9-fb873a5e35d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fd19f9fa-62cd-4dcf-99e9-fb873a5e35d8"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-58b1730e-7b19-4c6c-9402-5f5a7cd48780

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58b1730e-7b19-4c6c-9402-5f5a7cd48780
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-58b1730e-7b19-4c6c-9402-5f5a7cd48780
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
Content-Length: 181

{"id":"acc_4cd6644c-e961-4683-93cb-3331ce650c1e","handle":"qa-8033b7bbd188","displayName":"QA 8033b7bbd188","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.550528010Z"}
```

## 81. DELETE /v1/accounts/me

```text
#81 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a3b9e362-2e96-44ea-b8c5-c58f01a31e56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3b9e362-2e96-44ea-b8c5-c58f01a31e56
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a3b9e362-2e96-44ea-b8c5-c58f01a31e56
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

## 82. POST /v1/auth/token

```text
#82 POST http://localhost:7070/v1/auth/token
correlation: qa-1755350a-7fe5-4eb4-ab8a-993456be2262

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1755350a-7fe5-4eb4-ab8a-993456be2262
Content-Type: application/json

--- request body ---
{"handle":"qa-8033b7bbd188","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1755350a-7fe5-4eb4-ab8a-993456be2262
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1755350a-7fe5-4eb4-ab8a-993456be2262"}
```
